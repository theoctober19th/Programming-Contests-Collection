#include<iostream>

#define thisnode tree[node]
#define leftnode tree[2*node]
#define rightnode tree[2*node+1]
using namespace std;

// typedef struct{
// 	bool sorted;
// 	int leftpos;
// 	int rightpos;
// } nodestruct;

class nodestruct{
public:
	bool sorted;
	int leftpos;
	int rightpos;
	nodestruct(){
		sorted = false;
	}
};

void build(int node, int start, int end, long arr[], nodestruct tree[]){
	if(start == end){
		//leaf node
		thisnode.sorted = true;
		thisnode.leftpos = start;
		thisnode.rightpos = start;
	}else{
		int mid = (start + end) / 2;
		build(2*node, start, mid, arr, tree);
		build(2*node+1, mid+1, end, arr, tree);
		
		thisnode.leftpos = leftnode.leftpos;
		thisnode.rightpos = rightnode.rightpos;
		if( leftnode.sorted && rightnode.sorted && (arr[leftnode.rightpos] <= arr[rightnode.leftpos]) ){
			thisnode.sorted = true;
		}else{
			thisnode.sorted = false;
		}
	}
}

void update(int node, int start, int end, int index, long value, long arr[], nodestruct tree[]){
	if(start == end){
		//leaf node
		arr[index] = value;
		thisnode.sorted = true;
	}else{
		int mid = (start + end) / 2;
		if(start <= index && index <= mid){
			update (2*node, start, mid, index, value, arr, tree);
		}else{
			update(2*node+1, mid+1, end, index, value, arr, tree);
		}

		if( leftnode.sorted && rightnode.sorted && (arr[leftnode.rightpos] <= arr[rightnode.leftpos]) ){
			thisnode.sorted = true;
		}else{
			thisnode.sorted = false;
		}
	}
}

bool query(int node, int start, int end, int l, int r, nodestruct tree[], long arr[]){
	//if(start == end) return true;
	if(r < start || end < l){ //given range (l,r) completely outside the range represented node
		return true;
	}
	if(l <= start && end <=r){ //node range is completely inside given range (l,r)
		return thisnode.sorted;
	}

	int mid = (start + end) / 2;
	bool p1 = query(2*node, start, mid, l, r, tree, arr);
	bool p2 = query(2*node+1, mid+1, end, l, r ,tree, arr);
	return p1 && p2 && (arr[leftnode.rightpos] <= arr[rightnode.leftpos]);
}

void display(long arr[], int n){
	cout << "\nARRAY: ";
	for(int i=1; i<=n; i++){
		cout << arr[i] << " ";
	}
}

void displaytree(nodestruct arr[], int n){
	cout << "\nTREE: ";
	for(int i=1; i<=n; i++){
		cout << arr[i].sorted << " ";
	}
}

int main(){
	int t;
    cin >> t;
    for(int i=0; i<t; i++){
        int n; cin >> n;
        long arr[n+1];
        nodestruct tree[2*n+1];
        for(int j=1; j<=n; j++){
            cin >> arr[j];
        }

        build(1,1,n,arr,tree);

        int q; cin >> q;
        for(int k=0; k<q; k++){
            int p; cin >> p;
            int l, r;
            if(p==1){
                long x; cin >> l >> x;

                update(1,1,n,l+1,x,arr,tree);
            }else{
                cin >> l >> r;

                bool res  = query(1,1,n,l+1,r+1,tree, arr);
                if(res){
                    cout << "yes\n";
                }else{
                    cout << "no\n";
                }
            }
        }
    }
    return 0;
}