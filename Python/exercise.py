"""
y = [x for x in range(5)]
print (y)
print(str(y),type(str(y)))
s = 'abs'
print(s, type(s))

squared = [x**3 for x in range(5)]
print(squared)


s = 'I love 2 go t0 the store 7 times a w3ek.'
i= [x for x in s if x.isnumeric()]
print (type(i[0]))
print(''.join(i))

l= ['abc','def','ghi', 'abc']
a = [str(k) for k,v in enumerate(l) if v == 'abc']

print(''.join(a))

x=[[1,2],[3,4]]
a=[g for b in x for g in b]
print(a)

s = "12345"
s = [x+',' for x in s]
s = ''.join(s).rstrip(',')

print(s)

l = "Hello world how are you"
l = l.split(" ")
l.reverse()
l = [x+"," for x in l]
l = "".join(l).rstrip(",")
print(l)


a = 10

b = 3

#Addition

c = a+b

print(c)

#Subtraction

c = a-b

print(c)

#Multiplication

c = a*b

print(c)

#Division

c = a/b

print(c)

#Floor Division

c = a // b

print(c)

#Modulus

c = a%b

print(c)

stack = list()
stack.append(1)
stack.append(2)
print (stack)
stack.pop()
print (stack)

a=v=1
def change():
    global v 
    v = 2
    print(v)

change()
print(v)

b = "Python"
assert b == "Python", "b should be 'Python'"


A=30
B=20
C=40

if ((A>B) and (B<C)):
    print("A is greater than B and B is less than C")

a = 4

b = 5

c = True
print(a and b)

print (a or b)

print(not c)

A = 10

B = 15

result = A!=B

print(result)

A = 10

B = 10

result = A!=B 
print(result)

a = 4

b = 5

print(a & b)

print (a | b)

print(a ^ b)

print(~ a)

a = 5

if a is 5:

   print("The value of  a is 5")

if a is not 4:

   print("The value of a is not 4")

"""