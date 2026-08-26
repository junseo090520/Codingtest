def solution(dots):
    answer = 0
    dots.sort()
    print(dots)
    answer = (dots[0][0] - dots[2][0]) * (dots[0][1] - dots[1][1])
    return answer