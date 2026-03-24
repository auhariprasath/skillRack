#include<iostream>
#include<vector>
using namespace std;
int main(){
    int t;
    cin>>t;
    while(t-->0){
        int n;
        cin>>n;
        vector<int> a(n);
        for(int i=0;i<n;i++){
            cin>>a[i];
        }
        int s = a[0];
        int c =1;
        for(int i=1;i<n;i++){
            if(a(i)>=max){
                c++;
                s=a[i];
            }
        }
        cout<<c;
    }
}