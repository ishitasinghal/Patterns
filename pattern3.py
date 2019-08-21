for i in range(1,4):
    for j in range(1,6):
        if(j>=(4-i) and j<=(i+2)):
            print('$', end='')
        else:
            print(' ', end='')
    print()
for i in range(1, 4):
    for j in range(1, 6):
        if (j >= i and j <= (6 - i)):
            print('$', end='')
        else:
            print(' ', end='')
    print()