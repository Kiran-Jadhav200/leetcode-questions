class Solution {
    public int numberOfBeams(String[] bank) {
        int beams = 0;
        int prev = 0;
        for (String row : bank) {
            int cnt = 0;
            for (char c : row.toCharArray()) {
                if (c == '1') {
                    cnt++;
                }
            }
            beams += cnt * prev;
            if (cnt > 0) {
                prev = cnt;
            }
        }
        return beams;
    }
}
