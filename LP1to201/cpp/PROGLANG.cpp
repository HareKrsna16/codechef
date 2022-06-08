#include <bits/stdc++.h>
using namespace std;

int main() {
	int t, a, b, a1, b1, a2, b2;
	cin >> t;
	while(t--) {
		cin >> a >> b >> a1 >> b1 >> a2 >> b2; 
		cout << (((a1==a||a1==b)&&(b1==b||b1==a))?1:(((a2==a||a2==b)&&(b2==a||b2==b))?2:0)) << endl;
	}
}
