#include <bits/stdc++.h>
using namespace std;

int main() {
	long long int t, n, x, s, r;
	cin >> t;
	while(t--) {
		cin >> n >> x;
		long long int rating=0;
		while(n--) {
			cin >> s >> r;
			if(s<=x && r>=rating) {			 
				rating = r;
			}
		}
		cout << rating << endl;
	}
}
