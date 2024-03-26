package example

// @main def main(args: String*): Unit =
//   println(s"Hello ${args.mkString}")

import java.io.IOException

import zio._

object MainApp extends ZIOAppDefault {
  def run: IO[IOException, Unit] =
    Console.printLine("Hello, World!")
}
