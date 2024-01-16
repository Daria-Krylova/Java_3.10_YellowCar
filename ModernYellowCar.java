import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;

public class ModernYellowCar extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g;

        // Включаем сглаживание для лучшего вида
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Определяем размеры и позиции элементов машины
        int carWidth = 200;
        int carHeight = 60;
        int carX = 100;
        int carY = 150;

        // Рисуем кузов машины
        g2d.setColor(Color.YELLOW);
        g2d.fillRoundRect(carX, carY, carWidth, carHeight / 2, 20, 20); // Нижняя часть кузова
        g2d.fillRoundRect(carX + 10, carY - 30, carWidth - 20, carHeight / 2, 20, 20); // Верхняя часть кузова

        // Черная обводка для кузова
        g2d.setColor(Color.BLACK);
        g2d.drawRoundRect(carX, carY, carWidth, carHeight / 2, 20, 20);
        g2d.drawRoundRect(carX + 10, carY - 30, carWidth - 20, carHeight / 2, 20, 20);

        // Рисуем колёса
        g2d.setColor(Color.BLACK);
        g2d.fill(new Ellipse2D.Double(carX + 15, carY + 40, 40, 40)); // Левое колесо
        g2d.fill(new Ellipse2D.Double(carX + carWidth - 55, carY + 40, 40, 40)); // Правое колесо

        // Детали колёс
        g2d.setColor(Color.GRAY);
        g2d.fill(new Ellipse2D.Double(carX + 25, carY + 50, 20, 20)); // Центр левого колеса
        g2d.fill(new Ellipse2D.Double(carX + carWidth - 45, carY + 50, 20, 20)); // Центр правого колеса

        // Рисуем окна
        g2d.setColor(Color.CYAN);
        g2d.fillRoundRect(carX + 30, carY - 20, 50, 30, 10, 10); // Переднее окно
        g2d.fillRoundRect(carX + carWidth - 80, carY - 20, 50, 30, 10, 10); // Заднее окно
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Modern Yellow Car");
        ModernYellowCar car = new ModernYellowCar();
        frame.add(car);
        frame.setSize(400, 300); // Увеличиваем размер окна
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
