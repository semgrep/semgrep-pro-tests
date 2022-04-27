package com;

@ResponseStatus(HttpStatus.BAD_REQUEST)
class RuntimeException extends Exception {
  public RuntimeException(String exception) {
    super(exception);
  }
}
