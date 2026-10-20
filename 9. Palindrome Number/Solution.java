bool isPalindrome(int x) {
    if (x < 10 && x >= 0)
        return true;
    else if(x < 0){
        return false;
    }
    long modules = 10;
    long palindrome = 0;

    while(modules < 100000000000){
        palindrome += (x%modules)/(modules/10);

        palindrome *=10;
        if (modules <= x)
            modules *= 10;
        else{
            palindrome /=10;
            break;
        }
    }
    printf("%d", palindrome);
    if(palindrome == x)
        return true;
    return false;
}