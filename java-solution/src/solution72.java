//edit distance
public class solution72 {
	public int minDistance(String word1, String word2) {
		int length1 = word1.length();
		int length2 = word2.length();
		int[][] dist = new int[length1 + 1][length2 + 1];
		for(int i = 0; i <= length1; i++) {
			dist[i][0] = i;
		}
		for(int j = 0; j <= length2; j++) {
			dist[0][j] = j;
		}
		for(int i = 1; i <= length1; i++) {
			for(int j = 1; j <= length2; j++) {
				if(word1.charAt(i - 1) == word2.charAt(j - 1)) {
					dist[i][j] = dist[i - 1][j - 1];
				}
				else {
					dist[i][j] = Math.min(dist[i - 1][j - 1], Math.min(dist[i - 1][j], dist[i][j-1])) + 1;
				}
			}
		}
		return dist[length1][length2];
    }
}
