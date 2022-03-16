days = int(input("Enter the number of days: "))

months = days//30
m_days = days%30

weeks = days // 7
w_days = days%7

print(months, "month(s) and", m_days, "day(s)")
print("or,")
print(weeks, "week(s) and", w_days, "day(s)")