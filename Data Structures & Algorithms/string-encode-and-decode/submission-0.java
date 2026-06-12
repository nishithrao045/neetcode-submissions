class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb=new StringBuilder();
         for (String s : strs) {
            sb.append(s.length()).append('#').append(s);
        }

        return sb.toString();
    }

    public List<String> decode(String s) {
         List<String> result = new ArrayList<>();
        int i = 0;

        while (i < s.length()) {
            int j = i;

            // find delimiter '#'
            while (s.charAt(j) != '#') {
                j++;
            }

            int length = Integer.parseInt(s.substring(i, j));

            // move past '#'
            j++;

            String word = s.substring(j, j + length);
            result.add(word);

            // move to next segment
            i = j + length;
        }

        return result;
    }
}
