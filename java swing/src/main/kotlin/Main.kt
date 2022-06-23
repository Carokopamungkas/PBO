import java.awt.BorderLayout
import java.awt.Dimension
import javax.swing.JFrame
import javax.swing.*


fun main(args: Array<String>) {




    val frame = JFrame("Hello word")
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)
        frame.setSize(Dimension(600, 400))
        frame.setLocationRelativeTo(null)
        frame.setVisible(true)

    val closeBtn = JButton("Close")
        closeBtn.addActionListener { System.exit(0) }



}