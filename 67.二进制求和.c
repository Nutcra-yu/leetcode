/*
 * @lc app=leetcode.cn id=67 lang=c
 *
 * [67] 二进制求和
 */

// @lc code=start

void reserve(char *s)
{
    int len = strlen(s);
    for (int i = 0; i < len / 2; i++)
    {
        char t = s[i];
        s[i] = s[len - i - 1], s[len - i - 1] = t;
    }
}

char *addBinary(char *a, char *b)
{
    reserve(a);
    reserve(b);

    int len_a = strlen(a), len_b = strlen(b);
    int n = fmax(len_a, len_b), carry = 0, len = 0;
    char *ans = (char *)malloc(sizeof(char) * (n + 2));
    for (int i = 0; i < n; ++i)
    {
        carry += i < len_a ? (a[i] == '1') : 0;
        carry += i < len_b ? (b[i] == '1') : 0;
        ans[len++] = carry % 2 + '0';
        carry /= 2;
    }

    if (carry)
    {
        ans[len++] = '1';
    }
    ans[len] = '\0';
    reserve(ans);

    return ans;
}

char *addBinary(char *a, char *b) {
	int len_a = strlen(a), len_b = strlen(b);
	int n = len_a > len_b ? len_a : len_b;

	char *c = (char *)malloc(sizeof(char) * (n + 2));
	c[n] = '\0';

	n--;
	len_a--;
	len_b--;
	int flag = 0, t1, t2;
	while (len_a >= 0 || len_b >= 0) {
		if (len_a >= 0)
			t1 = a[len_a] - '0';
		else
			t1 = 0;

		if (len_b >= 0)
			t2 = b[len_b] - '0';
		else
			t2 = 0;

		c[n] = (t1 + t2 + flag) % 2 + '0';

		if ((t1 + t2 + flag) >= 2)
			flag = 1;
		else
			flag = 0;

		n--;
		len_a--;
		len_b--;
	}

	char *ssss;

	if (flag) {
		ssss = (char *)malloc(sizeof(char) * 2);
		ssss[0]= '1';
		ssss[1] = '\0';
		strcat(ssss, c);
	}

	return ssss;
}
// @lc code=end