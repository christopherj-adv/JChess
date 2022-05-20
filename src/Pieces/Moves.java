package Pieces;

// Contains defi
public enum Moves {
    VERTICAL_FORWARDS_STEP,             // One step forwards
    VERTICAL_BACKWARDS_STEP,            // One step backwards
    VERTICAL_FORWARDS_STEP_ATTACK,      // Can attack one step forwards
    VERTICAL_BACKWARDS_STEP_ATTACK,     // Can attack one step backwards
    VERTICAL_ACROSS,                    // Can move vertically
    VERTICAL_ACROSS_ATTACK,             // Can attack verticaly

    HORIZONTAL_STEP,                    // Able to step horizontally
    HORIZONTAL_STEP_ATTACK,             // Can attack one step horizontally
    HORIZONTAL_ACROSS,                  // Able to move horizontally
    HORIZONTAL_ATTACK,                  // Able to attack diagonally
    
    DIAGONAL_STEP,                      // One step diagonally
    DIAGONAL_STEP_ATTACK,               // Can attack one step diagonally
    DIAGONAL_FORWARDS_STEP,             // One step forwards diagonally
    DIAGONAL_FORWARDS_STEP_ATTACK,      // Can attack one step forwards diagonally
    DIAGONAL_ACROSS,                    // Able to move diagonally
    DIAGONAL_ATTACK,                    // Able to attack diagonally
    
    // Custom
    EN_PASSANT,                         // Special rule en passant
    CASTLE,                             // The piece is allowed to castle

    ALL                                 // Can do all of the above.
}
