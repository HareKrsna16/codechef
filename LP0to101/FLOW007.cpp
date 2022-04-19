#include <bits/stdc++.h>
using namespace std;

int main() {
	int t, n;
	cin >> t;
	while(t--) {
		int rev=0;
		cin >> n;
		while(n!=0) {
			int l = n%10;
			rev = rev*10 + l;
			n/=10;
		}
		cout << rev << endl;
	}
}

