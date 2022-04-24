#include <bits/stdc++.h>
using namespace std;

int main() {
	long long int t, d, l, r;
	cin >> t;
	while(t--) {
		cin >> d >> l>> r;
		if (d >= l && d <= r)
			cout << "Take second dose now" << endl;
		else if (d < l)
			cout << "Too Early" << endl;
		else if (d > r)
			cout << "Too Late" << endl;
	}
}
