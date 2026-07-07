#include<bits/stdc++.h>
using namespace std;

int main(){

    int n,m;
    long long y;

    cin >> n >> m >> y;

    vector<pair<int,long long>> g[n+3];

    for(int i=0;i<m;i++){

        int u,v;
        long long t;

        cin >> u >> v >> t;

        g[u].push_back({v,t});
        g[v].push_back({u,t});
    }

    g[n+1].push_back({n+2,y});

    for(int i=1;i<=n;i++){

        long long x;
        cin >> x;

        g[i].push_back({n+1,x});

        g[n+2].push_back({i,x});
    }

    const long long INF = 1e18;

    vector<long long> dist(n+3,INF);

    priority_queue<
        pair<long long,int>,
        vector<pair<long long,int>>,
        greater<pair<long long,int>>
    > pq;

    dist[1]=0;

    pq.push({0,1});

    while(!pq.empty()){

        auto [d,u] = pq.top();
        pq.pop();

        if(d!=dist[u])
            continue;

        for(auto [v,w]:g[u]){

            if(dist[v] > d+w){

                dist[v]=d+w;

                pq.push({dist[v],v});
            }
        }
    }

    for(int i=2;i<=n;i++)
        cout<<dist[i]<<" ";

}