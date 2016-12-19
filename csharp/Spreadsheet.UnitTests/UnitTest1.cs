using NUnit.Framework;

namespace Spreadsheet.UnitTests
{
    [TestFixture]
    public class UnitTest1
    {
        [Test]
        public void TestMethod1()
        {
            Assert.That(true, Is.EqualTo(false), "uitbreiden aub");
        }
    }
}