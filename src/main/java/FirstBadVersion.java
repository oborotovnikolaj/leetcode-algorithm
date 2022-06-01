public class FirstBadVersion {

    public int badVersion;

    public int firstBadVersion(int n) {
        int tail = n;
        int pivot = n / 2;
        int head = 0;
        while (tail - head > 1) {
            if (isBadVersion(pivot)) {
                tail = pivot;
                pivot = (tail + 1)/ 2 + head / 2;
            } else {
                head = pivot;
                pivot = (tail + 1)/ 2 + head / 2;
            }
        }
        if (isBadVersion(head)) {
            return head;
        }
        return tail;
    }

    public boolean isBadVersion(int version) {
        return version >= badVersion;
    }
}
