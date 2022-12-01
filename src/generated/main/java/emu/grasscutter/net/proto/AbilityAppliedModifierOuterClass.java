// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.Message;
import java.io.InputStream;
import com.google.protobuf.ByteString;
import java.nio.ByteBuffer;
import com.google.protobuf.Internal;
import com.google.protobuf.CodedOutputStream;
import java.io.IOException;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Parser;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Descriptors;

public final class AbilityAppliedModifierOuterClass
{
    private static final Descriptors.Descriptor internal_static_AbilityAppliedModifier_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_AbilityAppliedModifier_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private AbilityAppliedModifierOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return AbilityAppliedModifierOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u001cAbilityAppliedModifier.proto\u001a\u001dAbilityAttachedModifier.proto\u001a\u0013AbilityString.proto\u001a\u0018ModifierDurability.proto\"\u00e9\u0003\n\u0016AbilityAppliedModifier\u0012\u0019\n\u0011modifier_local_id\u0018\u0001 \u0001(\u0005\u0012 \n\u0018parent_ability_entity_id\u0018\u0002 \u0001(\r\u0012+\n\u0013parent_ability_name\u0018\u0003 \u0001(\u000b2\u000e.AbilityString\u0012/\n\u0017parent_ability_override\u0018\u0004 \u0001(\u000b2\u000e.AbilityString\u0012\u001c\n\u0014instanced_ability_id\u0018\u0005 \u0001(\r\u0012\u001d\n\u0015instanced_modifier_id\u0018\u0006 \u0001(\r\u0012\u0016\n\u000eexist_duration\u0018\u0007 \u0001(\u0002\u0012=\n\u001battached_instanced_modifier\u0018\b \u0001(\u000b2\u0018.AbilityAttachedModifier\u0012\u0017\n\u000fapply_entity_id\u0018\t \u0001(\r\u0012\"\n\u001ais_attached_parent_ability\u0018\n \u0001(\b\u00120\n\u0013modifier_durability\u0018\u000b \u0001(\u000b2\u0013.ModifierDurability\u0012\u0011\n\tsbuff_uid\u0018\f \u0001(\r\u0012\u001e\n\u0016is_serverbuff_modifier\u0018\r \u0001(\bB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        AbilityAppliedModifierOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { AbilityAttachedModifierOuterClass.getDescriptor(), AbilityStringOuterClass.getDescriptor(), ModifierDurabilityOuterClass.getDescriptor() });
        internal_static_AbilityAppliedModifier_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_AbilityAppliedModifier_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(AbilityAppliedModifierOuterClass.internal_static_AbilityAppliedModifier_descriptor, new String[] { "ModifierLocalId", "ParentAbilityEntityId", "ParentAbilityName", "ParentAbilityOverride", "InstancedAbilityId", "InstancedModifierId", "ExistDuration", "AttachedInstancedModifier", "ApplyEntityId", "IsAttachedParentAbility", "ModifierDurability", "SbuffUid", "IsServerbuffModifier" });
        AbilityAttachedModifierOuterClass.getDescriptor();
        AbilityStringOuterClass.getDescriptor();
        ModifierDurabilityOuterClass.getDescriptor();
    }
    
    public static final class AbilityAppliedModifier extends GeneratedMessageV3 implements AbilityAppliedModifierOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int MODIFIER_LOCAL_ID_FIELD_NUMBER = 1;
        private int modifierLocalId_;
        public static final int PARENT_ABILITY_ENTITY_ID_FIELD_NUMBER = 2;
        private int parentAbilityEntityId_;
        public static final int PARENT_ABILITY_NAME_FIELD_NUMBER = 3;
        private AbilityStringOuterClass.AbilityString parentAbilityName_;
        public static final int PARENT_ABILITY_OVERRIDE_FIELD_NUMBER = 4;
        private AbilityStringOuterClass.AbilityString parentAbilityOverride_;
        public static final int INSTANCED_ABILITY_ID_FIELD_NUMBER = 5;
        private int instancedAbilityId_;
        public static final int INSTANCED_MODIFIER_ID_FIELD_NUMBER = 6;
        private int instancedModifierId_;
        public static final int EXIST_DURATION_FIELD_NUMBER = 7;
        private float existDuration_;
        public static final int ATTACHED_INSTANCED_MODIFIER_FIELD_NUMBER = 8;
        private AbilityAttachedModifierOuterClass.AbilityAttachedModifier attachedInstancedModifier_;
        public static final int APPLY_ENTITY_ID_FIELD_NUMBER = 9;
        private int applyEntityId_;
        public static final int IS_ATTACHED_PARENT_ABILITY_FIELD_NUMBER = 10;
        private boolean isAttachedParentAbility_;
        public static final int MODIFIER_DURABILITY_FIELD_NUMBER = 11;
        private ModifierDurabilityOuterClass.ModifierDurability modifierDurability_;
        public static final int SBUFF_UID_FIELD_NUMBER = 12;
        private int sbuffUid_;
        public static final int IS_SERVERBUFF_MODIFIER_FIELD_NUMBER = 13;
        private boolean isServerbuffModifier_;
        private byte memoizedIsInitialized;
        private static final AbilityAppliedModifier DEFAULT_INSTANCE;
        private static final Parser<AbilityAppliedModifier> PARSER;
        
        private AbilityAppliedModifier(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private AbilityAppliedModifier() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new AbilityAppliedModifier();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private AbilityAppliedModifier(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this();
            if (extensionRegistry == null) {
                throw new NullPointerException();
            }
            final UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    final int tag = input.readTag();
                    switch (tag) {
                        case 0: {
                            done = true;
                            continue;
                        }
                        case 8: {
                            this.modifierLocalId_ = input.readInt32();
                            continue;
                        }
                        case 16: {
                            this.parentAbilityEntityId_ = input.readUInt32();
                            continue;
                        }
                        case 26: {
                            AbilityStringOuterClass.AbilityString.Builder subBuilder = null;
                            if (this.parentAbilityName_ != null) {
                                subBuilder = this.parentAbilityName_.toBuilder();
                            }
                            this.parentAbilityName_ = input.readMessage(AbilityStringOuterClass.AbilityString.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(this.parentAbilityName_);
                                this.parentAbilityName_ = subBuilder.buildPartial();
                                continue;
                            }
                            continue;
                        }
                        case 34: {
                            AbilityStringOuterClass.AbilityString.Builder subBuilder = null;
                            if (this.parentAbilityOverride_ != null) {
                                subBuilder = this.parentAbilityOverride_.toBuilder();
                            }
                            this.parentAbilityOverride_ = input.readMessage(AbilityStringOuterClass.AbilityString.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(this.parentAbilityOverride_);
                                this.parentAbilityOverride_ = subBuilder.buildPartial();
                                continue;
                            }
                            continue;
                        }
                        case 40: {
                            this.instancedAbilityId_ = input.readUInt32();
                            continue;
                        }
                        case 48: {
                            this.instancedModifierId_ = input.readUInt32();
                            continue;
                        }
                        case 61: {
                            this.existDuration_ = input.readFloat();
                            continue;
                        }
                        case 66: {
                            AbilityAttachedModifierOuterClass.AbilityAttachedModifier.Builder subBuilder2 = null;
                            if (this.attachedInstancedModifier_ != null) {
                                subBuilder2 = this.attachedInstancedModifier_.toBuilder();
                            }
                            this.attachedInstancedModifier_ = input.readMessage(AbilityAttachedModifierOuterClass.AbilityAttachedModifier.parser(), extensionRegistry);
                            if (subBuilder2 != null) {
                                subBuilder2.mergeFrom(this.attachedInstancedModifier_);
                                this.attachedInstancedModifier_ = subBuilder2.buildPartial();
                                continue;
                            }
                            continue;
                        }
                        case 72: {
                            this.applyEntityId_ = input.readUInt32();
                            continue;
                        }
                        case 80: {
                            this.isAttachedParentAbility_ = input.readBool();
                            continue;
                        }
                        case 90: {
                            ModifierDurabilityOuterClass.ModifierDurability.Builder subBuilder3 = null;
                            if (this.modifierDurability_ != null) {
                                subBuilder3 = this.modifierDurability_.toBuilder();
                            }
                            this.modifierDurability_ = input.readMessage(ModifierDurabilityOuterClass.ModifierDurability.parser(), extensionRegistry);
                            if (subBuilder3 != null) {
                                subBuilder3.mergeFrom(this.modifierDurability_);
                                this.modifierDurability_ = subBuilder3.buildPartial();
                                continue;
                            }
                            continue;
                        }
                        case 96: {
                            this.sbuffUid_ = input.readUInt32();
                            continue;
                        }
                        case 104: {
                            this.isServerbuffModifier_ = input.readBool();
                            continue;
                        }
                        default: {
                            if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                                done = true;
                                continue;
                            }
                            continue;
                        }
                    }
                }
            }
            catch (InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            }
            catch (IOException e2) {
                throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
            }
            finally {
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return AbilityAppliedModifierOuterClass.internal_static_AbilityAppliedModifier_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return AbilityAppliedModifierOuterClass.internal_static_AbilityAppliedModifier_fieldAccessorTable.ensureFieldAccessorsInitialized(AbilityAppliedModifier.class, Builder.class);
        }
        
        @Override
        public int getModifierLocalId() {
            return this.modifierLocalId_;
        }
        
        @Override
        public int getParentAbilityEntityId() {
            return this.parentAbilityEntityId_;
        }
        
        @Override
        public boolean hasParentAbilityName() {
            return this.parentAbilityName_ != null;
        }
        
        @Override
        public AbilityStringOuterClass.AbilityString getParentAbilityName() {
            return (this.parentAbilityName_ == null) ? AbilityStringOuterClass.AbilityString.getDefaultInstance() : this.parentAbilityName_;
        }
        
        @Override
        public AbilityStringOuterClass.AbilityStringOrBuilder getParentAbilityNameOrBuilder() {
            return this.getParentAbilityName();
        }
        
        @Override
        public boolean hasParentAbilityOverride() {
            return this.parentAbilityOverride_ != null;
        }
        
        @Override
        public AbilityStringOuterClass.AbilityString getParentAbilityOverride() {
            return (this.parentAbilityOverride_ == null) ? AbilityStringOuterClass.AbilityString.getDefaultInstance() : this.parentAbilityOverride_;
        }
        
        @Override
        public AbilityStringOuterClass.AbilityStringOrBuilder getParentAbilityOverrideOrBuilder() {
            return this.getParentAbilityOverride();
        }
        
        @Override
        public int getInstancedAbilityId() {
            return this.instancedAbilityId_;
        }
        
        @Override
        public int getInstancedModifierId() {
            return this.instancedModifierId_;
        }
        
        @Override
        public float getExistDuration() {
            return this.existDuration_;
        }
        
        @Override
        public boolean hasAttachedInstancedModifier() {
            return this.attachedInstancedModifier_ != null;
        }
        
        @Override
        public AbilityAttachedModifierOuterClass.AbilityAttachedModifier getAttachedInstancedModifier() {
            return (this.attachedInstancedModifier_ == null) ? AbilityAttachedModifierOuterClass.AbilityAttachedModifier.getDefaultInstance() : this.attachedInstancedModifier_;
        }
        
        @Override
        public AbilityAttachedModifierOuterClass.AbilityAttachedModifierOrBuilder getAttachedInstancedModifierOrBuilder() {
            return this.getAttachedInstancedModifier();
        }
        
        @Override
        public int getApplyEntityId() {
            return this.applyEntityId_;
        }
        
        @Override
        public boolean getIsAttachedParentAbility() {
            return this.isAttachedParentAbility_;
        }
        
        @Override
        public boolean hasModifierDurability() {
            return this.modifierDurability_ != null;
        }
        
        @Override
        public ModifierDurabilityOuterClass.ModifierDurability getModifierDurability() {
            return (this.modifierDurability_ == null) ? ModifierDurabilityOuterClass.ModifierDurability.getDefaultInstance() : this.modifierDurability_;
        }
        
        @Override
        public ModifierDurabilityOuterClass.ModifierDurabilityOrBuilder getModifierDurabilityOrBuilder() {
            return this.getModifierDurability();
        }
        
        @Override
        public int getSbuffUid() {
            return this.sbuffUid_;
        }
        
        @Override
        public boolean getIsServerbuffModifier() {
            return this.isServerbuffModifier_;
        }
        
        @Override
        public final boolean isInitialized() {
            final byte isInitialized = this.memoizedIsInitialized;
            if (isInitialized == 1) {
                return true;
            }
            if (isInitialized == 0) {
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }
        
        @Override
        public void writeTo(final CodedOutputStream output) throws IOException {
            if (this.modifierLocalId_ != 0) {
                output.writeInt32(1, this.modifierLocalId_);
            }
            if (this.parentAbilityEntityId_ != 0) {
                output.writeUInt32(2, this.parentAbilityEntityId_);
            }
            if (this.parentAbilityName_ != null) {
                output.writeMessage(3, this.getParentAbilityName());
            }
            if (this.parentAbilityOverride_ != null) {
                output.writeMessage(4, this.getParentAbilityOverride());
            }
            if (this.instancedAbilityId_ != 0) {
                output.writeUInt32(5, this.instancedAbilityId_);
            }
            if (this.instancedModifierId_ != 0) {
                output.writeUInt32(6, this.instancedModifierId_);
            }
            if (this.existDuration_ != 0.0f) {
                output.writeFloat(7, this.existDuration_);
            }
            if (this.attachedInstancedModifier_ != null) {
                output.writeMessage(8, this.getAttachedInstancedModifier());
            }
            if (this.applyEntityId_ != 0) {
                output.writeUInt32(9, this.applyEntityId_);
            }
            if (this.isAttachedParentAbility_) {
                output.writeBool(10, this.isAttachedParentAbility_);
            }
            if (this.modifierDurability_ != null) {
                output.writeMessage(11, this.getModifierDurability());
            }
            if (this.sbuffUid_ != 0) {
                output.writeUInt32(12, this.sbuffUid_);
            }
            if (this.isServerbuffModifier_) {
                output.writeBool(13, this.isServerbuffModifier_);
            }
            this.unknownFields.writeTo(output);
        }
        
        @Override
        public int getSerializedSize() {
            int size = this.memoizedSize;
            if (size != -1) {
                return size;
            }
            size = 0;
            if (this.modifierLocalId_ != 0) {
                size += CodedOutputStream.computeInt32Size(1, this.modifierLocalId_);
            }
            if (this.parentAbilityEntityId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(2, this.parentAbilityEntityId_);
            }
            if (this.parentAbilityName_ != null) {
                size += CodedOutputStream.computeMessageSize(3, this.getParentAbilityName());
            }
            if (this.parentAbilityOverride_ != null) {
                size += CodedOutputStream.computeMessageSize(4, this.getParentAbilityOverride());
            }
            if (this.instancedAbilityId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(5, this.instancedAbilityId_);
            }
            if (this.instancedModifierId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(6, this.instancedModifierId_);
            }
            if (this.existDuration_ != 0.0f) {
                size += CodedOutputStream.computeFloatSize(7, this.existDuration_);
            }
            if (this.attachedInstancedModifier_ != null) {
                size += CodedOutputStream.computeMessageSize(8, this.getAttachedInstancedModifier());
            }
            if (this.applyEntityId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(9, this.applyEntityId_);
            }
            if (this.isAttachedParentAbility_) {
                size += CodedOutputStream.computeBoolSize(10, this.isAttachedParentAbility_);
            }
            if (this.modifierDurability_ != null) {
                size += CodedOutputStream.computeMessageSize(11, this.getModifierDurability());
            }
            if (this.sbuffUid_ != 0) {
                size += CodedOutputStream.computeUInt32Size(12, this.sbuffUid_);
            }
            if (this.isServerbuffModifier_) {
                size += CodedOutputStream.computeBoolSize(13, this.isServerbuffModifier_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AbilityAppliedModifier)) {
                return super.equals(obj);
            }
            final AbilityAppliedModifier other = (AbilityAppliedModifier)obj;
            return this.getModifierLocalId() == other.getModifierLocalId() && this.getParentAbilityEntityId() == other.getParentAbilityEntityId() && this.hasParentAbilityName() == other.hasParentAbilityName() && (!this.hasParentAbilityName() || this.getParentAbilityName().equals(other.getParentAbilityName())) && this.hasParentAbilityOverride() == other.hasParentAbilityOverride() && (!this.hasParentAbilityOverride() || this.getParentAbilityOverride().equals(other.getParentAbilityOverride())) && this.getInstancedAbilityId() == other.getInstancedAbilityId() && this.getInstancedModifierId() == other.getInstancedModifierId() && Float.floatToIntBits(this.getExistDuration()) == Float.floatToIntBits(other.getExistDuration()) && this.hasAttachedInstancedModifier() == other.hasAttachedInstancedModifier() && (!this.hasAttachedInstancedModifier() || this.getAttachedInstancedModifier().equals(other.getAttachedInstancedModifier())) && this.getApplyEntityId() == other.getApplyEntityId() && this.getIsAttachedParentAbility() == other.getIsAttachedParentAbility() && this.hasModifierDurability() == other.hasModifierDurability() && (!this.hasModifierDurability() || this.getModifierDurability().equals(other.getModifierDurability())) && this.getSbuffUid() == other.getSbuffUid() && this.getIsServerbuffModifier() == other.getIsServerbuffModifier() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 1;
            hash = 53 * hash + this.getModifierLocalId();
            hash = 37 * hash + 2;
            hash = 53 * hash + this.getParentAbilityEntityId();
            if (this.hasParentAbilityName()) {
                hash = 37 * hash + 3;
                hash = 53 * hash + this.getParentAbilityName().hashCode();
            }
            if (this.hasParentAbilityOverride()) {
                hash = 37 * hash + 4;
                hash = 53 * hash + this.getParentAbilityOverride().hashCode();
            }
            hash = 37 * hash + 5;
            hash = 53 * hash + this.getInstancedAbilityId();
            hash = 37 * hash + 6;
            hash = 53 * hash + this.getInstancedModifierId();
            hash = 37 * hash + 7;
            hash = 53 * hash + Float.floatToIntBits(this.getExistDuration());
            if (this.hasAttachedInstancedModifier()) {
                hash = 37 * hash + 8;
                hash = 53 * hash + this.getAttachedInstancedModifier().hashCode();
            }
            hash = 37 * hash + 9;
            hash = 53 * hash + this.getApplyEntityId();
            hash = 37 * hash + 10;
            hash = 53 * hash + Internal.hashBoolean(this.getIsAttachedParentAbility());
            if (this.hasModifierDurability()) {
                hash = 37 * hash + 11;
                hash = 53 * hash + this.getModifierDurability().hashCode();
            }
            hash = 37 * hash + 12;
            hash = 53 * hash + this.getSbuffUid();
            hash = 37 * hash + 13;
            hash = 53 * hash + Internal.hashBoolean(this.getIsServerbuffModifier());
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static AbilityAppliedModifier parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return AbilityAppliedModifier.PARSER.parseFrom(data);
        }
        
        public static AbilityAppliedModifier parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AbilityAppliedModifier.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AbilityAppliedModifier parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return AbilityAppliedModifier.PARSER.parseFrom(data);
        }
        
        public static AbilityAppliedModifier parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AbilityAppliedModifier.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AbilityAppliedModifier parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return AbilityAppliedModifier.PARSER.parseFrom(data);
        }
        
        public static AbilityAppliedModifier parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AbilityAppliedModifier.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AbilityAppliedModifier parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AbilityAppliedModifier.PARSER, input);
        }
        
        public static AbilityAppliedModifier parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AbilityAppliedModifier.PARSER, input, extensionRegistry);
        }
        
        public static AbilityAppliedModifier parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(AbilityAppliedModifier.PARSER, input);
        }
        
        public static AbilityAppliedModifier parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(AbilityAppliedModifier.PARSER, input, extensionRegistry);
        }
        
        public static AbilityAppliedModifier parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AbilityAppliedModifier.PARSER, input);
        }
        
        public static AbilityAppliedModifier parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AbilityAppliedModifier.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return AbilityAppliedModifier.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final AbilityAppliedModifier prototype) {
            return AbilityAppliedModifier.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == AbilityAppliedModifier.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static AbilityAppliedModifier getDefaultInstance() {
            return AbilityAppliedModifier.DEFAULT_INSTANCE;
        }
        
        public static Parser<AbilityAppliedModifier> parser() {
            return AbilityAppliedModifier.PARSER;
        }
        
        @Override
        public Parser<AbilityAppliedModifier> getParserForType() {
            return AbilityAppliedModifier.PARSER;
        }
        
        @Override
        public AbilityAppliedModifier getDefaultInstanceForType() {
            return AbilityAppliedModifier.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new AbilityAppliedModifier();
            PARSER = new AbstractParser<AbilityAppliedModifier>() {
                @Override
                public AbilityAppliedModifier parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new AbilityAppliedModifier(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AbilityAppliedModifierOrBuilder
        {
            private int modifierLocalId_;
            private int parentAbilityEntityId_;
            private AbilityStringOuterClass.AbilityString parentAbilityName_;
            private SingleFieldBuilderV3<AbilityStringOuterClass.AbilityString, AbilityStringOuterClass.AbilityString.Builder, AbilityStringOuterClass.AbilityStringOrBuilder> parentAbilityNameBuilder_;
            private AbilityStringOuterClass.AbilityString parentAbilityOverride_;
            private SingleFieldBuilderV3<AbilityStringOuterClass.AbilityString, AbilityStringOuterClass.AbilityString.Builder, AbilityStringOuterClass.AbilityStringOrBuilder> parentAbilityOverrideBuilder_;
            private int instancedAbilityId_;
            private int instancedModifierId_;
            private float existDuration_;
            private AbilityAttachedModifierOuterClass.AbilityAttachedModifier attachedInstancedModifier_;
            private SingleFieldBuilderV3<AbilityAttachedModifierOuterClass.AbilityAttachedModifier, AbilityAttachedModifierOuterClass.AbilityAttachedModifier.Builder, AbilityAttachedModifierOuterClass.AbilityAttachedModifierOrBuilder> attachedInstancedModifierBuilder_;
            private int applyEntityId_;
            private boolean isAttachedParentAbility_;
            private ModifierDurabilityOuterClass.ModifierDurability modifierDurability_;
            private SingleFieldBuilderV3<ModifierDurabilityOuterClass.ModifierDurability, ModifierDurabilityOuterClass.ModifierDurability.Builder, ModifierDurabilityOuterClass.ModifierDurabilityOrBuilder> modifierDurabilityBuilder_;
            private int sbuffUid_;
            private boolean isServerbuffModifier_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return AbilityAppliedModifierOuterClass.internal_static_AbilityAppliedModifier_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return AbilityAppliedModifierOuterClass.internal_static_AbilityAppliedModifier_fieldAccessorTable.ensureFieldAccessorsInitialized(AbilityAppliedModifier.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (AbilityAppliedModifier.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.modifierLocalId_ = 0;
                this.parentAbilityEntityId_ = 0;
                if (this.parentAbilityNameBuilder_ == null) {
                    this.parentAbilityName_ = null;
                }
                else {
                    this.parentAbilityName_ = null;
                    this.parentAbilityNameBuilder_ = null;
                }
                if (this.parentAbilityOverrideBuilder_ == null) {
                    this.parentAbilityOverride_ = null;
                }
                else {
                    this.parentAbilityOverride_ = null;
                    this.parentAbilityOverrideBuilder_ = null;
                }
                this.instancedAbilityId_ = 0;
                this.instancedModifierId_ = 0;
                this.existDuration_ = 0.0f;
                if (this.attachedInstancedModifierBuilder_ == null) {
                    this.attachedInstancedModifier_ = null;
                }
                else {
                    this.attachedInstancedModifier_ = null;
                    this.attachedInstancedModifierBuilder_ = null;
                }
                this.applyEntityId_ = 0;
                this.isAttachedParentAbility_ = false;
                if (this.modifierDurabilityBuilder_ == null) {
                    this.modifierDurability_ = null;
                }
                else {
                    this.modifierDurability_ = null;
                    this.modifierDurabilityBuilder_ = null;
                }
                this.sbuffUid_ = 0;
                this.isServerbuffModifier_ = false;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return AbilityAppliedModifierOuterClass.internal_static_AbilityAppliedModifier_descriptor;
            }
            
            @Override
            public AbilityAppliedModifier getDefaultInstanceForType() {
                return AbilityAppliedModifier.getDefaultInstance();
            }
            
            @Override
            public AbilityAppliedModifier build() {
                final AbilityAppliedModifier result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public AbilityAppliedModifier buildPartial() {
                final AbilityAppliedModifier result = new AbilityAppliedModifier(this);
                result.modifierLocalId_ = this.modifierLocalId_;
                result.parentAbilityEntityId_ = this.parentAbilityEntityId_;
                if (this.parentAbilityNameBuilder_ == null) {
                    result.parentAbilityName_ = this.parentAbilityName_;
                }
                else {
                    result.parentAbilityName_ = this.parentAbilityNameBuilder_.build();
                }
                if (this.parentAbilityOverrideBuilder_ == null) {
                    result.parentAbilityOverride_ = this.parentAbilityOverride_;
                }
                else {
                    result.parentAbilityOverride_ = this.parentAbilityOverrideBuilder_.build();
                }
                result.instancedAbilityId_ = this.instancedAbilityId_;
                result.instancedModifierId_ = this.instancedModifierId_;
                result.existDuration_ = this.existDuration_;
                if (this.attachedInstancedModifierBuilder_ == null) {
                    result.attachedInstancedModifier_ = this.attachedInstancedModifier_;
                }
                else {
                    result.attachedInstancedModifier_ = this.attachedInstancedModifierBuilder_.build();
                }
                result.applyEntityId_ = this.applyEntityId_;
                result.isAttachedParentAbility_ = this.isAttachedParentAbility_;
                if (this.modifierDurabilityBuilder_ == null) {
                    result.modifierDurability_ = this.modifierDurability_;
                }
                else {
                    result.modifierDurability_ = this.modifierDurabilityBuilder_.build();
                }
                result.sbuffUid_ = this.sbuffUid_;
                result.isServerbuffModifier_ = this.isServerbuffModifier_;
                this.onBuilt();
                return result;
            }
            
            @Override
            public Builder clone() {
                return super.clone();
            }
            
            @Override
            public Builder setField(final Descriptors.FieldDescriptor field, final Object value) {
                return super.setField(field, value);
            }
            
            @Override
            public Builder clearField(final Descriptors.FieldDescriptor field) {
                return super.clearField(field);
            }
            
            @Override
            public Builder clearOneof(final Descriptors.OneofDescriptor oneof) {
                return super.clearOneof(oneof);
            }
            
            @Override
            public Builder setRepeatedField(final Descriptors.FieldDescriptor field, final int index, final Object value) {
                return super.setRepeatedField(field, index, value);
            }
            
            @Override
            public Builder addRepeatedField(final Descriptors.FieldDescriptor field, final Object value) {
                return super.addRepeatedField(field, value);
            }
            
            @Override
            public Builder mergeFrom(final Message other) {
                if (other instanceof AbilityAppliedModifier) {
                    return this.mergeFrom((AbilityAppliedModifier)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final AbilityAppliedModifier other) {
                if (other == AbilityAppliedModifier.getDefaultInstance()) {
                    return this;
                }
                if (other.getModifierLocalId() != 0) {
                    this.setModifierLocalId(other.getModifierLocalId());
                }
                if (other.getParentAbilityEntityId() != 0) {
                    this.setParentAbilityEntityId(other.getParentAbilityEntityId());
                }
                if (other.hasParentAbilityName()) {
                    this.mergeParentAbilityName(other.getParentAbilityName());
                }
                if (other.hasParentAbilityOverride()) {
                    this.mergeParentAbilityOverride(other.getParentAbilityOverride());
                }
                if (other.getInstancedAbilityId() != 0) {
                    this.setInstancedAbilityId(other.getInstancedAbilityId());
                }
                if (other.getInstancedModifierId() != 0) {
                    this.setInstancedModifierId(other.getInstancedModifierId());
                }
                if (other.getExistDuration() != 0.0f) {
                    this.setExistDuration(other.getExistDuration());
                }
                if (other.hasAttachedInstancedModifier()) {
                    this.mergeAttachedInstancedModifier(other.getAttachedInstancedModifier());
                }
                if (other.getApplyEntityId() != 0) {
                    this.setApplyEntityId(other.getApplyEntityId());
                }
                if (other.getIsAttachedParentAbility()) {
                    this.setIsAttachedParentAbility(other.getIsAttachedParentAbility());
                }
                if (other.hasModifierDurability()) {
                    this.mergeModifierDurability(other.getModifierDurability());
                }
                if (other.getSbuffUid() != 0) {
                    this.setSbuffUid(other.getSbuffUid());
                }
                if (other.getIsServerbuffModifier()) {
                    this.setIsServerbuffModifier(other.getIsServerbuffModifier());
                }
                this.mergeUnknownFields(other.unknownFields);
                this.onChanged();
                return this;
            }
            
            @Override
            public final boolean isInitialized() {
                return true;
            }
            
            @Override
            public Builder mergeFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
                AbilityAppliedModifier parsedMessage = null;
                try {
                    parsedMessage = AbilityAppliedModifier.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (AbilityAppliedModifier)e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                }
                finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            
            @Override
            public int getModifierLocalId() {
                return this.modifierLocalId_;
            }
            
            public Builder setModifierLocalId(final int value) {
                this.modifierLocalId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearModifierLocalId() {
                this.modifierLocalId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getParentAbilityEntityId() {
                return this.parentAbilityEntityId_;
            }
            
            public Builder setParentAbilityEntityId(final int value) {
                this.parentAbilityEntityId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearParentAbilityEntityId() {
                this.parentAbilityEntityId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean hasParentAbilityName() {
                return this.parentAbilityNameBuilder_ != null || this.parentAbilityName_ != null;
            }
            
            @Override
            public AbilityStringOuterClass.AbilityString getParentAbilityName() {
                if (this.parentAbilityNameBuilder_ == null) {
                    return (this.parentAbilityName_ == null) ? AbilityStringOuterClass.AbilityString.getDefaultInstance() : this.parentAbilityName_;
                }
                return this.parentAbilityNameBuilder_.getMessage();
            }
            
            public Builder setParentAbilityName(final AbilityStringOuterClass.AbilityString value) {
                if (this.parentAbilityNameBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.parentAbilityName_ = value;
                    this.onChanged();
                }
                else {
                    this.parentAbilityNameBuilder_.setMessage(value);
                }
                return this;
            }
            
            public Builder setParentAbilityName(final AbilityStringOuterClass.AbilityString.Builder builderForValue) {
                if (this.parentAbilityNameBuilder_ == null) {
                    this.parentAbilityName_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.parentAbilityNameBuilder_.setMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder mergeParentAbilityName(final AbilityStringOuterClass.AbilityString value) {
                if (this.parentAbilityNameBuilder_ == null) {
                    if (this.parentAbilityName_ != null) {
                        this.parentAbilityName_ = AbilityStringOuterClass.AbilityString.newBuilder(this.parentAbilityName_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.parentAbilityName_ = value;
                    }
                    this.onChanged();
                }
                else {
                    this.parentAbilityNameBuilder_.mergeFrom(value);
                }
                return this;
            }
            
            public Builder clearParentAbilityName() {
                if (this.parentAbilityNameBuilder_ == null) {
                    this.parentAbilityName_ = null;
                    this.onChanged();
                }
                else {
                    this.parentAbilityName_ = null;
                    this.parentAbilityNameBuilder_ = null;
                }
                return this;
            }
            
            public AbilityStringOuterClass.AbilityString.Builder getParentAbilityNameBuilder() {
                this.onChanged();
                return this.getParentAbilityNameFieldBuilder().getBuilder();
            }
            
            @Override
            public AbilityStringOuterClass.AbilityStringOrBuilder getParentAbilityNameOrBuilder() {
                if (this.parentAbilityNameBuilder_ != null) {
                    return this.parentAbilityNameBuilder_.getMessageOrBuilder();
                }
                return (this.parentAbilityName_ == null) ? AbilityStringOuterClass.AbilityString.getDefaultInstance() : this.parentAbilityName_;
            }
            
            private SingleFieldBuilderV3<AbilityStringOuterClass.AbilityString, AbilityStringOuterClass.AbilityString.Builder, AbilityStringOuterClass.AbilityStringOrBuilder> getParentAbilityNameFieldBuilder() {
                if (this.parentAbilityNameBuilder_ == null) {
                    this.parentAbilityNameBuilder_ = new SingleFieldBuilderV3<AbilityStringOuterClass.AbilityString, AbilityStringOuterClass.AbilityString.Builder, AbilityStringOuterClass.AbilityStringOrBuilder>(this.getParentAbilityName(), this.getParentForChildren(), this.isClean());
                    this.parentAbilityName_ = null;
                }
                return this.parentAbilityNameBuilder_;
            }
            
            @Override
            public boolean hasParentAbilityOverride() {
                return this.parentAbilityOverrideBuilder_ != null || this.parentAbilityOverride_ != null;
            }
            
            @Override
            public AbilityStringOuterClass.AbilityString getParentAbilityOverride() {
                if (this.parentAbilityOverrideBuilder_ == null) {
                    return (this.parentAbilityOverride_ == null) ? AbilityStringOuterClass.AbilityString.getDefaultInstance() : this.parentAbilityOverride_;
                }
                return this.parentAbilityOverrideBuilder_.getMessage();
            }
            
            public Builder setParentAbilityOverride(final AbilityStringOuterClass.AbilityString value) {
                if (this.parentAbilityOverrideBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.parentAbilityOverride_ = value;
                    this.onChanged();
                }
                else {
                    this.parentAbilityOverrideBuilder_.setMessage(value);
                }
                return this;
            }
            
            public Builder setParentAbilityOverride(final AbilityStringOuterClass.AbilityString.Builder builderForValue) {
                if (this.parentAbilityOverrideBuilder_ == null) {
                    this.parentAbilityOverride_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.parentAbilityOverrideBuilder_.setMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder mergeParentAbilityOverride(final AbilityStringOuterClass.AbilityString value) {
                if (this.parentAbilityOverrideBuilder_ == null) {
                    if (this.parentAbilityOverride_ != null) {
                        this.parentAbilityOverride_ = AbilityStringOuterClass.AbilityString.newBuilder(this.parentAbilityOverride_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.parentAbilityOverride_ = value;
                    }
                    this.onChanged();
                }
                else {
                    this.parentAbilityOverrideBuilder_.mergeFrom(value);
                }
                return this;
            }
            
            public Builder clearParentAbilityOverride() {
                if (this.parentAbilityOverrideBuilder_ == null) {
                    this.parentAbilityOverride_ = null;
                    this.onChanged();
                }
                else {
                    this.parentAbilityOverride_ = null;
                    this.parentAbilityOverrideBuilder_ = null;
                }
                return this;
            }
            
            public AbilityStringOuterClass.AbilityString.Builder getParentAbilityOverrideBuilder() {
                this.onChanged();
                return this.getParentAbilityOverrideFieldBuilder().getBuilder();
            }
            
            @Override
            public AbilityStringOuterClass.AbilityStringOrBuilder getParentAbilityOverrideOrBuilder() {
                if (this.parentAbilityOverrideBuilder_ != null) {
                    return this.parentAbilityOverrideBuilder_.getMessageOrBuilder();
                }
                return (this.parentAbilityOverride_ == null) ? AbilityStringOuterClass.AbilityString.getDefaultInstance() : this.parentAbilityOverride_;
            }
            
            private SingleFieldBuilderV3<AbilityStringOuterClass.AbilityString, AbilityStringOuterClass.AbilityString.Builder, AbilityStringOuterClass.AbilityStringOrBuilder> getParentAbilityOverrideFieldBuilder() {
                if (this.parentAbilityOverrideBuilder_ == null) {
                    this.parentAbilityOverrideBuilder_ = new SingleFieldBuilderV3<AbilityStringOuterClass.AbilityString, AbilityStringOuterClass.AbilityString.Builder, AbilityStringOuterClass.AbilityStringOrBuilder>(this.getParentAbilityOverride(), this.getParentForChildren(), this.isClean());
                    this.parentAbilityOverride_ = null;
                }
                return this.parentAbilityOverrideBuilder_;
            }
            
            @Override
            public int getInstancedAbilityId() {
                return this.instancedAbilityId_;
            }
            
            public Builder setInstancedAbilityId(final int value) {
                this.instancedAbilityId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearInstancedAbilityId() {
                this.instancedAbilityId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getInstancedModifierId() {
                return this.instancedModifierId_;
            }
            
            public Builder setInstancedModifierId(final int value) {
                this.instancedModifierId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearInstancedModifierId() {
                this.instancedModifierId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public float getExistDuration() {
                return this.existDuration_;
            }
            
            public Builder setExistDuration(final float value) {
                this.existDuration_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearExistDuration() {
                this.existDuration_ = 0.0f;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean hasAttachedInstancedModifier() {
                return this.attachedInstancedModifierBuilder_ != null || this.attachedInstancedModifier_ != null;
            }
            
            @Override
            public AbilityAttachedModifierOuterClass.AbilityAttachedModifier getAttachedInstancedModifier() {
                if (this.attachedInstancedModifierBuilder_ == null) {
                    return (this.attachedInstancedModifier_ == null) ? AbilityAttachedModifierOuterClass.AbilityAttachedModifier.getDefaultInstance() : this.attachedInstancedModifier_;
                }
                return this.attachedInstancedModifierBuilder_.getMessage();
            }
            
            public Builder setAttachedInstancedModifier(final AbilityAttachedModifierOuterClass.AbilityAttachedModifier value) {
                if (this.attachedInstancedModifierBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.attachedInstancedModifier_ = value;
                    this.onChanged();
                }
                else {
                    this.attachedInstancedModifierBuilder_.setMessage(value);
                }
                return this;
            }
            
            public Builder setAttachedInstancedModifier(final AbilityAttachedModifierOuterClass.AbilityAttachedModifier.Builder builderForValue) {
                if (this.attachedInstancedModifierBuilder_ == null) {
                    this.attachedInstancedModifier_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.attachedInstancedModifierBuilder_.setMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder mergeAttachedInstancedModifier(final AbilityAttachedModifierOuterClass.AbilityAttachedModifier value) {
                if (this.attachedInstancedModifierBuilder_ == null) {
                    if (this.attachedInstancedModifier_ != null) {
                        this.attachedInstancedModifier_ = AbilityAttachedModifierOuterClass.AbilityAttachedModifier.newBuilder(this.attachedInstancedModifier_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.attachedInstancedModifier_ = value;
                    }
                    this.onChanged();
                }
                else {
                    this.attachedInstancedModifierBuilder_.mergeFrom(value);
                }
                return this;
            }
            
            public Builder clearAttachedInstancedModifier() {
                if (this.attachedInstancedModifierBuilder_ == null) {
                    this.attachedInstancedModifier_ = null;
                    this.onChanged();
                }
                else {
                    this.attachedInstancedModifier_ = null;
                    this.attachedInstancedModifierBuilder_ = null;
                }
                return this;
            }
            
            public AbilityAttachedModifierOuterClass.AbilityAttachedModifier.Builder getAttachedInstancedModifierBuilder() {
                this.onChanged();
                return this.getAttachedInstancedModifierFieldBuilder().getBuilder();
            }
            
            @Override
            public AbilityAttachedModifierOuterClass.AbilityAttachedModifierOrBuilder getAttachedInstancedModifierOrBuilder() {
                if (this.attachedInstancedModifierBuilder_ != null) {
                    return this.attachedInstancedModifierBuilder_.getMessageOrBuilder();
                }
                return (this.attachedInstancedModifier_ == null) ? AbilityAttachedModifierOuterClass.AbilityAttachedModifier.getDefaultInstance() : this.attachedInstancedModifier_;
            }
            
            private SingleFieldBuilderV3<AbilityAttachedModifierOuterClass.AbilityAttachedModifier, AbilityAttachedModifierOuterClass.AbilityAttachedModifier.Builder, AbilityAttachedModifierOuterClass.AbilityAttachedModifierOrBuilder> getAttachedInstancedModifierFieldBuilder() {
                if (this.attachedInstancedModifierBuilder_ == null) {
                    this.attachedInstancedModifierBuilder_ = new SingleFieldBuilderV3<AbilityAttachedModifierOuterClass.AbilityAttachedModifier, AbilityAttachedModifierOuterClass.AbilityAttachedModifier.Builder, AbilityAttachedModifierOuterClass.AbilityAttachedModifierOrBuilder>(this.getAttachedInstancedModifier(), this.getParentForChildren(), this.isClean());
                    this.attachedInstancedModifier_ = null;
                }
                return this.attachedInstancedModifierBuilder_;
            }
            
            @Override
            public int getApplyEntityId() {
                return this.applyEntityId_;
            }
            
            public Builder setApplyEntityId(final int value) {
                this.applyEntityId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearApplyEntityId() {
                this.applyEntityId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean getIsAttachedParentAbility() {
                return this.isAttachedParentAbility_;
            }
            
            public Builder setIsAttachedParentAbility(final boolean value) {
                this.isAttachedParentAbility_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearIsAttachedParentAbility() {
                this.isAttachedParentAbility_ = false;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean hasModifierDurability() {
                return this.modifierDurabilityBuilder_ != null || this.modifierDurability_ != null;
            }
            
            @Override
            public ModifierDurabilityOuterClass.ModifierDurability getModifierDurability() {
                if (this.modifierDurabilityBuilder_ == null) {
                    return (this.modifierDurability_ == null) ? ModifierDurabilityOuterClass.ModifierDurability.getDefaultInstance() : this.modifierDurability_;
                }
                return this.modifierDurabilityBuilder_.getMessage();
            }
            
            public Builder setModifierDurability(final ModifierDurabilityOuterClass.ModifierDurability value) {
                if (this.modifierDurabilityBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.modifierDurability_ = value;
                    this.onChanged();
                }
                else {
                    this.modifierDurabilityBuilder_.setMessage(value);
                }
                return this;
            }
            
            public Builder setModifierDurability(final ModifierDurabilityOuterClass.ModifierDurability.Builder builderForValue) {
                if (this.modifierDurabilityBuilder_ == null) {
                    this.modifierDurability_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.modifierDurabilityBuilder_.setMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder mergeModifierDurability(final ModifierDurabilityOuterClass.ModifierDurability value) {
                if (this.modifierDurabilityBuilder_ == null) {
                    if (this.modifierDurability_ != null) {
                        this.modifierDurability_ = ModifierDurabilityOuterClass.ModifierDurability.newBuilder(this.modifierDurability_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.modifierDurability_ = value;
                    }
                    this.onChanged();
                }
                else {
                    this.modifierDurabilityBuilder_.mergeFrom(value);
                }
                return this;
            }
            
            public Builder clearModifierDurability() {
                if (this.modifierDurabilityBuilder_ == null) {
                    this.modifierDurability_ = null;
                    this.onChanged();
                }
                else {
                    this.modifierDurability_ = null;
                    this.modifierDurabilityBuilder_ = null;
                }
                return this;
            }
            
            public ModifierDurabilityOuterClass.ModifierDurability.Builder getModifierDurabilityBuilder() {
                this.onChanged();
                return this.getModifierDurabilityFieldBuilder().getBuilder();
            }
            
            @Override
            public ModifierDurabilityOuterClass.ModifierDurabilityOrBuilder getModifierDurabilityOrBuilder() {
                if (this.modifierDurabilityBuilder_ != null) {
                    return this.modifierDurabilityBuilder_.getMessageOrBuilder();
                }
                return (this.modifierDurability_ == null) ? ModifierDurabilityOuterClass.ModifierDurability.getDefaultInstance() : this.modifierDurability_;
            }
            
            private SingleFieldBuilderV3<ModifierDurabilityOuterClass.ModifierDurability, ModifierDurabilityOuterClass.ModifierDurability.Builder, ModifierDurabilityOuterClass.ModifierDurabilityOrBuilder> getModifierDurabilityFieldBuilder() {
                if (this.modifierDurabilityBuilder_ == null) {
                    this.modifierDurabilityBuilder_ = new SingleFieldBuilderV3<ModifierDurabilityOuterClass.ModifierDurability, ModifierDurabilityOuterClass.ModifierDurability.Builder, ModifierDurabilityOuterClass.ModifierDurabilityOrBuilder>(this.getModifierDurability(), this.getParentForChildren(), this.isClean());
                    this.modifierDurability_ = null;
                }
                return this.modifierDurabilityBuilder_;
            }
            
            @Override
            public int getSbuffUid() {
                return this.sbuffUid_;
            }
            
            public Builder setSbuffUid(final int value) {
                this.sbuffUid_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearSbuffUid() {
                this.sbuffUid_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean getIsServerbuffModifier() {
                return this.isServerbuffModifier_;
            }
            
            public Builder setIsServerbuffModifier(final boolean value) {
                this.isServerbuffModifier_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearIsServerbuffModifier() {
                this.isServerbuffModifier_ = false;
                this.onChanged();
                return this;
            }
            
            @Override
            public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }
            
            @Override
            public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }
        }
    }
    
    public interface AbilityAppliedModifierOrBuilder extends MessageOrBuilder
    {
        int getModifierLocalId();
        
        int getParentAbilityEntityId();
        
        boolean hasParentAbilityName();
        
        AbilityStringOuterClass.AbilityString getParentAbilityName();
        
        AbilityStringOuterClass.AbilityStringOrBuilder getParentAbilityNameOrBuilder();
        
        boolean hasParentAbilityOverride();
        
        AbilityStringOuterClass.AbilityString getParentAbilityOverride();
        
        AbilityStringOuterClass.AbilityStringOrBuilder getParentAbilityOverrideOrBuilder();
        
        int getInstancedAbilityId();
        
        int getInstancedModifierId();
        
        float getExistDuration();
        
        boolean hasAttachedInstancedModifier();
        
        AbilityAttachedModifierOuterClass.AbilityAttachedModifier getAttachedInstancedModifier();
        
        AbilityAttachedModifierOuterClass.AbilityAttachedModifierOrBuilder getAttachedInstancedModifierOrBuilder();
        
        int getApplyEntityId();
        
        boolean getIsAttachedParentAbility();
        
        boolean hasModifierDurability();
        
        ModifierDurabilityOuterClass.ModifierDurability getModifierDurability();
        
        ModifierDurabilityOuterClass.ModifierDurabilityOrBuilder getModifierDurabilityOrBuilder();
        
        int getSbuffUid();
        
        boolean getIsServerbuffModifier();
    }
}
