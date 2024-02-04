def one_loop(l: list) -> bool:
    for i in range(len(l)):
        nOE = 0
        for j in range(len(l)):
            if l[i] == l[j]:
                nOE=nOE + 1
        if nOE == 2:
            return True
    return False    

if __name__ == "__main__":
    List1 = one_loop([1,2,3,4,5,6])
    List2 = one_loop([23,91,54,29,23,30])

    print(List1)
    print(List2)