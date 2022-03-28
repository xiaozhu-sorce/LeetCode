package Contest.winter_contest;

import java.util.Scanner;

public class L {

    static int maxn = 1000010;
    static int[] a = new int[maxn];
    static class Tree{
        int l,r,sum,lzy;
    };
    static Tree[] tree = new Tree[maxn];
    public static void init(){
        for(int i=0;i<maxn;i++){
            tree[i] = new Tree();
        }
    }
    public static void pushup(int k){
        tree[k].sum=tree[k<<1].sum+tree[k<<1|1].sum;
    }
    public static void pushdown(int k){
        if(tree[k].lzy>0){
            tree[k<<1].lzy+=tree[k].lzy;
            tree[k<<1|1].lzy+=tree[k].lzy;
            tree[k<<1].sum+=tree[k].lzy*(tree[k<<1].r-tree[k<<1].l+1);
            tree[k<<1|1].sum+=tree[k].lzy*(tree[k<<1|1].r-tree[k<<1|1].l+1);
            tree[k].lzy=0;
        }
    }
    public static void build(int l,int r,int k){
        tree[k].l=l; tree[k].r=r; tree[k].lzy=0;
        if(l==r){
            tree[k].sum=a[l];
            return;
        }
        int mid=(l+r)>>1;
        build(l,mid,k<<1);
        build(mid+1,r,k<<1|1);
        pushup(k);
    }
    public static void update(int l,int r,int val,int k){
        if(l<=tree[k].l && tree[k].r<=r){
            tree[k].lzy+=val;
            tree[k].sum+=val*(tree[k].r-tree[k].l+1);
            return;
        }
        pushdown(k);
        int mid=(tree[k].l+tree[k].r)>>1;
        if(l<=mid) update(l,r,val,k<<1);
        if(r> mid) update(l,r,val,k<<1|1);
        pushup(k);
    }
    public static int query(int l,int r,int k){
        if(l<=tree[k].l && tree[k].r<=r){
            return tree[k].sum;
        }
        pushdown(k);
        int mid=(tree[k].l+tree[k].r)>>1,ans=0;
        if(l<=mid) ans+=query(l,r,k<<1);
        if(r> mid) ans+=query(l,r,k<<1|1);
        return ans;
    }
    public static void main(String[] args) {
        init();
        int sum = 0;
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        for(int i=1;i<=n;i++) a[i] = input.nextInt();
        build(1,n,1);

        for(int i=1;i<=m;i++){
            int l=input.nextInt();
            int r=input.nextInt();
            int x=input.nextInt();

            update(l,r,x,1);

            int num1 = n;
            int nu = 0;
            while(num1 >= 1){
                nu+=num1;
                num1/=2;
            }
            sum = nu*query(1,n,1);
            System.out.println(sum);
        }
    }
}

