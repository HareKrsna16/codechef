#include <bits/stdc++.h>
using namespace std;

int main() {
	long long int t, n;
	cin >> t;
	while(t--) {
		cin >> n;
		int fours=0;
		while(n!=0) {
			if (n%10 == 4)
				++fours;
			n/=10;
		}
		cout << fours << endl;
	}
}
