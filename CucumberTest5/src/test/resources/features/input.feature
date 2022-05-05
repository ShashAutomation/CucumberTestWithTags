Feature: Tag Name Test

  @test1
  Scenario: Run 1
    Given test1

  @test1
  Scenario: Run2
    Given got

  @test2
  Scenario: Run3
    Given Test2 got executed

  @test3
  Scenario: Run4
    Given Test3 got executed

  @test1
  Scenario: Run5
    Given executed

  @test1 @test2
  Scenario: Run6
    Given Test1 and Test2 got executed
