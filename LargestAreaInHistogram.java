public class LargestAreaInHistogram {

    static int[] findPrevSmaller(int[] arr) {
        int ans[] = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                ans[i] = 0;
            } else {
                ans[i] = st.peek() + 1;
            }
            st.push(i);
        }
        return ans;

    }

    static int[] findNextSmall(int[] arr) {
        int ans[] = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                ans[i] = arr.length - 1;
            } else {
                ans[i] = st.peek() - 1;
            }
            st.push(i);
        }
        return ans;

    }

    static int calculateMaxArea(int[] arr) {
        int prevSmall[] = findPrevSmaller(arr);
        int nextSmall[] = findNextSmall(arr);
        int maxArea = 0;
        for (int i = 0; i < arr.length; i++) {
            int width = nextSmall[i] - prevSmall[i] + 1;
            int area = width * arr[i];
            maxArea = Math.max(maxArea, area);
        }
        return maxArea;

    }

    public static void main(String[] args) {
        int arr[] = { 2, 1, 5, 6, 2, 3, 1 };
        int maxArea = calculateMaxArea(arr);
        System.out.println("The maximum area is " + maxArea);
    }

}
