#include <bits/stdc++.h>
using namespace std;

int main() {
	int t, n;
	cin >> t;
	while(t--) {
		int sum=0;
		cin >> n;
		while(n!=0) {
			int l = n%10;
			sum += l;
			n/=10;
		}
		cout << sum << endl;
	}
}

