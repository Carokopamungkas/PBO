import java.awt.BorderLayout
import java.awt.Dimension
import javax.swing.JFrame
import javax.swing.JLabel
import javax.swing.JScrollPane
import javax.swing.JTextArea


fun main(args: Array<String>) {

    val textArea = JTextArea()
    textArea.setText("nama : Caroko aji pamungkas")
    val scrollPane = JScrollPane(textArea)



    val frame = JFrame("Hallo")
    frame.getContentPane().add(scrollPane, BorderLayout.CENTER)
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)
    frame.setSize(Dimension(600, 400))
    frame.setLocationRelativeTo(null)
    frame.setVisible(true)


}