function createCounter(n) {  
    let count = n; // Initialize counter with the given starting value n  
    
    return function counter() {  
        return count++; // Return current value and increment  
    };  
} 