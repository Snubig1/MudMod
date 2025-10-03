
package net.mcreator.mudbackport.client.particle;

@OnlyIn(Dist.CLIENT)
public class GinkgoParticlesParticle extends TextureSheetParticle {

	public static GinkgoParticlesParticleProvider provider(SpriteSet spriteSet) {
		return new GinkgoParticlesParticleProvider(spriteSet);
	}

	public static class GinkgoParticlesParticleProvider implements ParticleProvider<SimpleParticleType> {
		private final SpriteSet spriteSet;

		public GinkgoParticlesParticleProvider(SpriteSet spriteSet) {
			this.spriteSet = spriteSet;
		}

		public Particle createParticle(SimpleParticleType typeIn, ClientLevel worldIn, double x, double y, double z, double xSpeed, double ySpeed, double zSpeed) {
			return new GinkgoParticlesParticle(worldIn, x, y, z, xSpeed, ySpeed, zSpeed, this.spriteSet);
		}
	}

	private final SpriteSet spriteSet;

	private float angularVelocity;
	private float angularAcceleration;

	protected GinkgoParticlesParticle(ClientLevel world, double x, double y, double z, double vx, double vy, double vz, SpriteSet spriteSet) {
		super(world, x, y, z);
		this.spriteSet = spriteSet;

		this.setSize(0.2f, 0.2f);
		this.quadSize *= 2f;

		this.lifetime = (int) Math.max(1, 40 + (this.random.nextInt(40) - 20));

		this.gravity = 0.5f;
		this.hasPhysics = true;

		this.xd = vx * 0.5;
		this.yd = vy * 0.5;
		this.zd = vz * 0.5;

		this.angularVelocity = 0.5f;
		this.angularAcceleration = 0f;

		this.pickSprite(spriteSet);
	}

	@Override
	public ParticleRenderType getRenderType() {
		return ParticleRenderType.PARTICLE_SHEET_OPAQUE;
	}

	@Override
	public void tick() {
		super.tick();

		this.oRoll = this.roll;
		this.roll += this.angularVelocity;
		this.angularVelocity += this.angularAcceleration;

	}

}
