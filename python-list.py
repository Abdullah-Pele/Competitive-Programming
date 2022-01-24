# https://www.hackerrank.com/challenges/python-lists/problem

def guessWhat(word, arr):
    if word.startswith("insert"):
        arrr = word.split(" ")
        index = int(arrr[1])
        value = int(arrr[2])
        arr.insert(index, value)
    elif word.startswith("append"):
        arrr = word.split(" ")

        arr.append(int(arrr[1]))
    elif word.startswith("remove"):
        arrr = word.split(" ")

        arr.remove(int(arrr[1]))
    elif word.startswith("sort"):
        arr.sort()
    elif word.startswith("print"):
        print(arr)
    elif word.startswith("reverse"):
        arr.reverse()
    elif word.startswith("pop"):
        arr.pop()


if __name__ == '__main__':
  n = int(input())
  arr = []

  for i in range(n):
      x = input()
      guessWhat(x, arr)
