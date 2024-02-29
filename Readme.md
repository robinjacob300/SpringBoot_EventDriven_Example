To Kill a process in windows do this command

netstat -ano | findstr "port_number"

eg: netstat -ano | findstr "8080"

taskkill /F /PID pid_number

eg: taskkill /F /PID 7952



## EVent Programming in Spring boot

This is an application which will do event programming
It has usual listners and Generic listeners
It uses Async

In event based programming we must define Events which has to be inherited from  
ApplicationEvent.
Event should have an EventPublisher and an EventListener.

our base API endpoint  

#####  localhost:8080/home