# Getting Started

### Liberty Bell casino implementation
This implementation was based on rules:  
http://slotgamedesign.com/2019/01/19/slot-math-tutorial-creating-par-sheets/

### How to pay
1. Launch application
2. Create new user:  
   method=GET  
   URL=http://localhost:8080/user?login={login}&pass={pass}
3. Make bet with user id (response body on step #2):  
   method=GET  
   URL=http://localhost:8080/game/bet/{id}
4. Continue playing until totalAmount is positive. New user has 100 credits when created.