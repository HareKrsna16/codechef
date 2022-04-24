#include <bits/stdc++.h>
using namespace std;

int main() {
	long long int n, k ,temp, out=0;
	cin >> n >> k;
	while(n--) {
		cin >> temp;
		if (temp%k == 0)
			++out;
	}
	cout << out;
	return 0;
}
