import java.util.Stack;

public class PreviousSmallerElement {

    static int[] findPreviousSmaller(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[arr.length];
        ans[0] = -1;
        st.push(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            while (!st.isEmpty() && st.peek() <= arr[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                ans[i] = -1;
            } else {
                ans[i] = st.peek();
            }
            st.push(arr[i]);

        }

        return ans;

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int ans[] = findPreviousSmaller(arr);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }

    }

}
