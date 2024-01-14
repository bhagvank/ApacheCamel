public class FlexibleSlidingWindow {
	
	
	public static void main(String[] args)
	{
		
		FlexibleSlidingWindow algo = new FlexibleSlidingWindow();
		int longStringLength = algo.lengthSubstring("sentence");
		
		System.out.println(longStringLength);
		
	}
    public int lengthSubstring(String str) {
        if (str == null || str.length() == 0)
            return 0;

        if (str.length() == 1)
            return 1;

        int maxSubstringLength = Integer.MIN_VALUE;

        int[] characterIndex = new int[128];
        int startWindowIdx = 0;

        for (int endWindowIdx = 0; endWindowIdx < str.length(); endWindowIdx++) {
            startWindowIdx = Math.max(startWindowIdx, characterIndex[str.charAt(endWindowIdx)]);

            maxSubstringLength = Math.max(endWindowIdx - startWindowIdx + 1, maxSubstringLength);
            characterIndex[str.charAt(endWindowIdx)] = endWindowIdx + 1;
        }
        return maxSubstringLength;
    }
}