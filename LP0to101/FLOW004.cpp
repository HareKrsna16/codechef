#include <bits/stdc++.h>
using namespace std;

int main() {
	int t, n;
	cin >> t;
	while(t--) {
		cin >> n;
		int sum = n%10;
		while(n!=0) {
			if (n<10)
				sum += n; 
			n/=10;
		}
		cout << sum  << endl;
	}
}
