class CalculatorConundrum {
    public String calculate(int operand1, int operand2, String operation) {
        int answer = 0;

        //check for the null or empty string
        if(operation == null){
            throw new IllegalArgumentException("Operation cannot be null");
        }
        if(operation.isEmpty()){
            throw new IllegalArgumentException("Operation cannot be empty");
        }
        //check the operator and do the calculation 
        try{
        if(operation=="+"){
            answer = operand1 + operand2;
        }else if(operation=="*"){
            answer = operand1 * operand2;
        }else if(operation=="/"){
            answer = operand1/operand2;
        }else{
            throw new IllegalOperationException("Operation '"+operation+"' does not exist");
        }
        }catch(ArithmeticException e){
            throw new IllegalOperationException("Division by zero is not allowed",e);
        }


        //return the string 
        return operand1+" "+operation+" "+operand2+" = "+answer;
    }
}
