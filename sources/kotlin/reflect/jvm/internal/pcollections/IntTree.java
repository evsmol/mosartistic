package kotlin.reflect.jvm.internal.pcollections;

final class IntTree<V> {
    static final IntTree<Object> EMPTYNODE = new IntTree<>();
    private final long key;
    private final IntTree<V> left;
    private final IntTree<V> right;
    private final int size;
    private final V value;

    private IntTree() {
        this.size = 0;
        this.key = 0;
        this.value = null;
        this.left = null;
        this.right = null;
    }

    private IntTree(long j, V v, IntTree<V> intTree, IntTree<V> intTree2) {
        this.key = j;
        this.value = v;
        this.left = intTree;
        this.right = intTree2;
        this.size = intTree.size + 1 + intTree2.size;
    }

    private IntTree<V> withKey(long j) {
        if (this.size == 0 || j == this.key) {
            return this;
        }
        return new IntTree(j, this.value, this.left, this.right);
    }

    /* access modifiers changed from: package-private */
    public V get(long j) {
        if (this.size == 0) {
            return null;
        }
        long j2 = this.key;
        if (j < j2) {
            return this.left.get(j - j2);
        }
        if (j > j2) {
            return this.right.get(j - j2);
        }
        return this.value;
    }

    /* access modifiers changed from: package-private */
    public IntTree<V> plus(long j, V v) {
        if (this.size == 0) {
            return new IntTree(j, v, this, this);
        }
        long j2 = this.key;
        if (j < j2) {
            return rebalanced(this.left.plus(j - j2, v), this.right);
        }
        if (j > j2) {
            return rebalanced(this.left, this.right.plus(j - j2, v));
        }
        if (v == this.value) {
            return this;
        }
        return new IntTree(j, v, this.left, this.right);
    }

    private IntTree<V> rebalanced(IntTree<V> intTree, IntTree<V> intTree2) {
        if (intTree == this.left && intTree2 == this.right) {
            return this;
        }
        return rebalanced(this.key, this.value, intTree, intTree2);
    }

    private static <V> IntTree<V> rebalanced(long j, V v, IntTree<V> intTree, IntTree<V> intTree2) {
        IntTree<V> intTree3 = intTree;
        int i = intTree3.size;
        int i2 = intTree2.size;
        if (i + i2 > 1) {
            if (i >= i2 * 5) {
                IntTree<V> intTree4 = intTree3.left;
                IntTree<V> intTree5 = intTree3.right;
                if (intTree5.size < intTree4.size * 2) {
                    long j2 = intTree3.key + j;
                    V v2 = intTree3.value;
                    long j3 = intTree3.key;
                    return new IntTree(j2, v2, intTree4, new IntTree(-j3, v, intTree5.withKey(intTree5.key + j3), intTree2));
                }
                IntTree<V> intTree6 = intTree5.left;
                IntTree<V> intTree7 = intTree5.right;
                long j4 = intTree5.key + intTree3.key + j;
                V v3 = intTree5.value;
                long j5 = intTree5.key;
                V v4 = v3;
                IntTree intTree8 = new IntTree(-j5, intTree3.value, intTree4, intTree6.withKey(intTree6.key + j5));
                long j6 = intTree3.key;
                long j7 = intTree5.key;
                return new IntTree(j4, v4, intTree8, new IntTree((-j6) - j7, v, intTree7.withKey(intTree7.key + j7 + j6), intTree2));
            }
            IntTree<V> intTree9 = intTree2;
            if (i2 >= i * 5) {
                IntTree<V> intTree10 = intTree9.left;
                IntTree<V> intTree11 = intTree9.right;
                if (intTree10.size < intTree11.size * 2) {
                    long j8 = intTree9.key + j;
                    V v5 = intTree9.value;
                    long j9 = intTree9.key;
                    return new IntTree(j8, v5, new IntTree(-j9, v, intTree, intTree10.withKey(intTree10.key + j9)), intTree11);
                }
                IntTree<V> intTree12 = intTree10.left;
                IntTree<V> intTree13 = intTree10.right;
                long j10 = intTree10.key + intTree9.key + j;
                V v6 = intTree10.value;
                long j11 = intTree9.key;
                long j12 = j10;
                long j13 = intTree10.key;
                IntTree intTree14 = new IntTree((-j11) - j13, v, intTree, intTree12.withKey(intTree12.key + j13 + j11));
                long j14 = intTree10.key;
                V v7 = intTree9.value;
                IntTree<V> intTree15 = intTree13;
                return new IntTree(j12, v6, intTree14, new IntTree(-j14, v7, intTree15.withKey(intTree15.key + j14), intTree11));
            }
        }
        return new IntTree(j, v, intTree, intTree2);
    }
}
