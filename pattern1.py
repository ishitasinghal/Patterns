# for i in range(5):
#     for j in range(5-i):
#         print('*', end='')
#     print()


for i in range(1,4):
    for j in range(1,7):
        if(j>=i and j <= (7-i)):
            print('*', end='')
        else:
            print(' ', end='')
    print()