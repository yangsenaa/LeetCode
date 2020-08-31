class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int length = rooms.size();
        int visited[] = new int[length];
        Queue<List<Integer>> queue = new LinkedList<>();
        queue.add(rooms.get(0));
        visited[0] = 1;
        int count = 1;
        List<Integer> room = new LinkedList<>();
        // BFS
        while(!queue.isEmpty()){
            room = queue.poll();
            for(Integer key : room){
                if(visited[key] == 0){
                    visited[key] = 1;
                    queue.add(rooms.get(key));
                    count++;
                }
            }
        }
        return count == length;
    }

}
