# Java Calculator Explanation
1. Original Calculator --- the first version, using `int` variables and `if-else if` statements.
2. Optimized Calculator --- an improved version, using `double`, a `switch` statement, division-by-zero validation, and explicit `Scanner` cleanup

## Difference between them
### 1. `int` verse `double` 
- the optimized version is more flexible because it supports decimal numbers
- `double` also has more precision than float, although binary floating-point types can still represent some decimal fractions only approximately

### 2. if-else verse switch
- `switch` is convenient when one variable is compared with several fixed values
- `if-else` remains useful for ranges and complex boolean conditions 
- Neither is universally better

### 3. Division: float cast versus double
- the original code already handles fractional division correctly for nonzero integer inputs because it explicitly casts an operand to `float`
- the revised version does not introduce fractional division for the first time, it uses `double` consistently for all operations and provides greater floating-point precision

### 4. Division by zero
Java floating-point division by zero produces infinity or NaN depending on the operands. 
The revised version checks first and displays a clear message instead

### 5. Temporary variable versus direct printing
The revised code avoids creating a temporary variable when the result is only printed once
Both approaches are valid. A variable is useful if the result is reused, tested or processed later

## Improvements:
1. Decimal input is supported.
2. `double` is used consistently.
3. Menu logic is easier to read.
4. Division by zero is handled with a clear message.
5. Output is more descriptive.

## Performance and Complexity
### Time Complexity
Both programs perform a **fixed number** of input operations, menu checks, and arithmetic operations.
Their work does not grow with the magnitude of the entered numbers
> O(1)

### Space Complexity
Both programs use a **fixed number of variables** and do not create data structures that grow with input size
> O(1)

## Advantages
### Calculator
- simple and beginner-friendly
- Demonstrates integer input and variables
- Practises Scanner and arithmetic operators
- Demonstrates if-else decision-making
- Uses an explicit cast support fractional division result

### Optimize Calculator
- Flexible input: Accepts whole and decimal numbers.
- Consistent type: Uses double for all calculations.
- Readable menu: Uses switch-case for fixed choices.
- Division validation: Checks for zero before dividing.
- Clear output: Displays a Result: label.
- Maintainability: Each operation is grouped in its own case.

## Disadvantages
### Calculator
- Cannot accept decimal input through nextInt().
- Uses float for division while other operations use int.
- Does not explicitly check for a zero divisor.
- Uses a longer conditional chain for fixed menu choices.
- Prints only the raw result.

### Optimize Calculator
- Does not handle non-numeric input gracefully. For example, entering
`hello` where a number is expected causes an
`InputMismatchException`.
- Performs only one calculation per execution.
- Does not use separate reusable methods for operations.
- Does not explicitly close the Scanner.
- Uses `double`, which can have rounding limitations for exact decimal
arithmetic.