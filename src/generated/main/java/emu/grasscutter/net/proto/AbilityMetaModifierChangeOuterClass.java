// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import java.util.Collection;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.RepeatedFieldBuilderV3;
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
import java.util.ArrayList;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.UnknownFieldSet;
import java.util.Collections;
import com.google.protobuf.Parser;
import java.util.List;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Descriptors;

public final class AbilityMetaModifierChangeOuterClass
{
    private static final Descriptors.Descriptor internal_static_AbilityMetaModifierChange_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_AbilityMetaModifierChange_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private AbilityMetaModifierChangeOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return AbilityMetaModifierChangeOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u001fAbilityMetaModifierChange.proto\u001a\u001dAbilityAttachedModifier.proto\u001a\u0013AbilityString.proto\u001a\u0014ModifierAction.proto\u001a\u0016ModifierProperty.proto\"¦\u0003\n\u0019AbilityMetaModifierChange\u0012=\n\u001battached_instanced_modifier\u0018\u0007 \u0001(\u000b2\u0018.AbilityAttachedModifier\u0012\u0017\n\u000fserver_buff_uid\u0018\u0004 \u0001(\r\u0012\"\n\u001ais_attached_parent_ability\u0018\n \u0001(\b\u0012\u001f\n\u0006action\u0018\r \u0001(\u000e2\u000f.ModifierAction\u0012\u0019\n\u0011modifier_local_id\u0018\u0002 \u0001(\u0005\u0012+\n\u0013parent_ability_name\u0018\u0001 \u0001(\u000b2\u000e.AbilityString\u0012\u0016\n\u000eis_mute_remote\u0018\u0006 \u0001(\b\u0012\u0017\n\u000fapply_entity_id\u0018\u0005 \u0001(\r\u0012%\n\nproperties\u0018\u0003 \u0003(\u000b2\u0011.ModifierProperty\u0012/\n\u0017parent_ability_override\u0018\u000b \u0001(\u000b2\u000e.AbilityString\u0012\u001b\n\u0013Unk2700_PMJMNCFJPDC\u0018\t \u0001(\bB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        AbilityMetaModifierChangeOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { AbilityAttachedModifierOuterClass.getDescriptor(), AbilityStringOuterClass.getDescriptor(), ModifierActionOuterClass.getDescriptor(), ModifierPropertyOuterClass.getDescriptor() });
        internal_static_AbilityMetaModifierChange_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_AbilityMetaModifierChange_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(AbilityMetaModifierChangeOuterClass.internal_static_AbilityMetaModifierChange_descriptor, new String[] { "AttachedInstancedModifier", "ServerBuffUid", "IsAttachedParentAbility", "Action", "ModifierLocalId", "ParentAbilityName", "IsMuteRemote", "ApplyEntityId", "Properties", "ParentAbilityOverride", "Unk2700PMJMNCFJPDC" });
        AbilityAttachedModifierOuterClass.getDescriptor();
        AbilityStringOuterClass.getDescriptor();
        ModifierActionOuterClass.getDescriptor();
        ModifierPropertyOuterClass.getDescriptor();
    }
    
    public static final class AbilityMetaModifierChange extends GeneratedMessageV3 implements AbilityMetaModifierChangeOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int ATTACHED_INSTANCED_MODIFIER_FIELD_NUMBER = 7;
        private AbilityAttachedModifierOuterClass.AbilityAttachedModifier attachedInstancedModifier_;
        public static final int SERVER_BUFF_UID_FIELD_NUMBER = 4;
        private int serverBuffUid_;
        public static final int IS_ATTACHED_PARENT_ABILITY_FIELD_NUMBER = 10;
        private boolean isAttachedParentAbility_;
        public static final int ACTION_FIELD_NUMBER = 13;
        private int action_;
        public static final int MODIFIER_LOCAL_ID_FIELD_NUMBER = 2;
        private int modifierLocalId_;
        public static final int PARENT_ABILITY_NAME_FIELD_NUMBER = 1;
        private AbilityStringOuterClass.AbilityString parentAbilityName_;
        public static final int IS_MUTE_REMOTE_FIELD_NUMBER = 6;
        private boolean isMuteRemote_;
        public static final int APPLY_ENTITY_ID_FIELD_NUMBER = 5;
        private int applyEntityId_;
        public static final int PROPERTIES_FIELD_NUMBER = 3;
        private List<ModifierPropertyOuterClass.ModifierProperty> properties_;
        public static final int PARENT_ABILITY_OVERRIDE_FIELD_NUMBER = 11;
        private AbilityStringOuterClass.AbilityString parentAbilityOverride_;
        public static final int UNK2700_PMJMNCFJPDC_FIELD_NUMBER = 9;
        private boolean unk2700PMJMNCFJPDC_;
        private byte memoizedIsInitialized;
        private static final AbilityMetaModifierChange DEFAULT_INSTANCE;
        private static final Parser<AbilityMetaModifierChange> PARSER;
        
        private AbilityMetaModifierChange(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private AbilityMetaModifierChange() {
            this.memoizedIsInitialized = -1;
            this.action_ = 0;
            this.properties_ = Collections.emptyList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new AbilityMetaModifierChange();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private AbilityMetaModifierChange(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this();
            if (extensionRegistry == null) {
                throw new NullPointerException();
            }
            int mutable_bitField0_ = 0;
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
                        case 10: {
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
                        case 16: {
                            this.modifierLocalId_ = input.readInt32();
                            continue;
                        }
                        case 26: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.properties_ = new ArrayList<ModifierPropertyOuterClass.ModifierProperty>();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.properties_.add(input.readMessage(ModifierPropertyOuterClass.ModifierProperty.parser(), extensionRegistry));
                            continue;
                        }
                        case 32: {
                            this.serverBuffUid_ = input.readUInt32();
                            continue;
                        }
                        case 40: {
                            this.applyEntityId_ = input.readUInt32();
                            continue;
                        }
                        case 48: {
                            this.isMuteRemote_ = input.readBool();
                            continue;
                        }
                        case 58: {
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
                            this.unk2700PMJMNCFJPDC_ = input.readBool();
                            continue;
                        }
                        case 80: {
                            this.isAttachedParentAbility_ = input.readBool();
                            continue;
                        }
                        case 90: {
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
                        case 104: {
                            final int rawValue = input.readEnum();
                            this.action_ = rawValue;
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
                if ((mutable_bitField0_ & 0x1) != 0x0) {
                    this.properties_ = Collections.unmodifiableList((List<? extends ModifierPropertyOuterClass.ModifierProperty>)this.properties_);
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return AbilityMetaModifierChangeOuterClass.internal_static_AbilityMetaModifierChange_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return AbilityMetaModifierChangeOuterClass.internal_static_AbilityMetaModifierChange_fieldAccessorTable.ensureFieldAccessorsInitialized(AbilityMetaModifierChange.class, Builder.class);
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
        public int getServerBuffUid() {
            return this.serverBuffUid_;
        }
        
        @Override
        public boolean getIsAttachedParentAbility() {
            return this.isAttachedParentAbility_;
        }
        
        @Override
        public int getActionValue() {
            return this.action_;
        }
        
        @Override
        public ModifierActionOuterClass.ModifierAction getAction() {
            final ModifierActionOuterClass.ModifierAction result = ModifierActionOuterClass.ModifierAction.valueOf(this.action_);
            return (result == null) ? ModifierActionOuterClass.ModifierAction.UNRECOGNIZED : result;
        }
        
        @Override
        public int getModifierLocalId() {
            return this.modifierLocalId_;
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
        public boolean getIsMuteRemote() {
            return this.isMuteRemote_;
        }
        
        @Override
        public int getApplyEntityId() {
            return this.applyEntityId_;
        }
        
        @Override
        public List<ModifierPropertyOuterClass.ModifierProperty> getPropertiesList() {
            return this.properties_;
        }
        
        @Override
        public List<? extends ModifierPropertyOuterClass.ModifierPropertyOrBuilder> getPropertiesOrBuilderList() {
            return this.properties_;
        }
        
        @Override
        public int getPropertiesCount() {
            return this.properties_.size();
        }
        
        @Override
        public ModifierPropertyOuterClass.ModifierProperty getProperties(final int index) {
            return this.properties_.get(index);
        }
        
        @Override
        public ModifierPropertyOuterClass.ModifierPropertyOrBuilder getPropertiesOrBuilder(final int index) {
            return this.properties_.get(index);
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
        public boolean getUnk2700PMJMNCFJPDC() {
            return this.unk2700PMJMNCFJPDC_;
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
            if (this.parentAbilityName_ != null) {
                output.writeMessage(1, this.getParentAbilityName());
            }
            if (this.modifierLocalId_ != 0) {
                output.writeInt32(2, this.modifierLocalId_);
            }
            for (int i = 0; i < this.properties_.size(); ++i) {
                output.writeMessage(3, this.properties_.get(i));
            }
            if (this.serverBuffUid_ != 0) {
                output.writeUInt32(4, this.serverBuffUid_);
            }
            if (this.applyEntityId_ != 0) {
                output.writeUInt32(5, this.applyEntityId_);
            }
            if (this.isMuteRemote_) {
                output.writeBool(6, this.isMuteRemote_);
            }
            if (this.attachedInstancedModifier_ != null) {
                output.writeMessage(7, this.getAttachedInstancedModifier());
            }
            if (this.unk2700PMJMNCFJPDC_) {
                output.writeBool(9, this.unk2700PMJMNCFJPDC_);
            }
            if (this.isAttachedParentAbility_) {
                output.writeBool(10, this.isAttachedParentAbility_);
            }
            if (this.parentAbilityOverride_ != null) {
                output.writeMessage(11, this.getParentAbilityOverride());
            }
            if (this.action_ != ModifierActionOuterClass.ModifierAction.ADDED.getNumber()) {
                output.writeEnum(13, this.action_);
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
            if (this.parentAbilityName_ != null) {
                size += CodedOutputStream.computeMessageSize(1, this.getParentAbilityName());
            }
            if (this.modifierLocalId_ != 0) {
                size += CodedOutputStream.computeInt32Size(2, this.modifierLocalId_);
            }
            for (int i = 0; i < this.properties_.size(); ++i) {
                size += CodedOutputStream.computeMessageSize(3, this.properties_.get(i));
            }
            if (this.serverBuffUid_ != 0) {
                size += CodedOutputStream.computeUInt32Size(4, this.serverBuffUid_);
            }
            if (this.applyEntityId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(5, this.applyEntityId_);
            }
            if (this.isMuteRemote_) {
                size += CodedOutputStream.computeBoolSize(6, this.isMuteRemote_);
            }
            if (this.attachedInstancedModifier_ != null) {
                size += CodedOutputStream.computeMessageSize(7, this.getAttachedInstancedModifier());
            }
            if (this.unk2700PMJMNCFJPDC_) {
                size += CodedOutputStream.computeBoolSize(9, this.unk2700PMJMNCFJPDC_);
            }
            if (this.isAttachedParentAbility_) {
                size += CodedOutputStream.computeBoolSize(10, this.isAttachedParentAbility_);
            }
            if (this.parentAbilityOverride_ != null) {
                size += CodedOutputStream.computeMessageSize(11, this.getParentAbilityOverride());
            }
            if (this.action_ != ModifierActionOuterClass.ModifierAction.ADDED.getNumber()) {
                size += CodedOutputStream.computeEnumSize(13, this.action_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AbilityMetaModifierChange)) {
                return super.equals(obj);
            }
            final AbilityMetaModifierChange other = (AbilityMetaModifierChange)obj;
            return this.hasAttachedInstancedModifier() == other.hasAttachedInstancedModifier() && (!this.hasAttachedInstancedModifier() || this.getAttachedInstancedModifier().equals(other.getAttachedInstancedModifier())) && this.getServerBuffUid() == other.getServerBuffUid() && this.getIsAttachedParentAbility() == other.getIsAttachedParentAbility() && this.action_ == other.action_ && this.getModifierLocalId() == other.getModifierLocalId() && this.hasParentAbilityName() == other.hasParentAbilityName() && (!this.hasParentAbilityName() || this.getParentAbilityName().equals(other.getParentAbilityName())) && this.getIsMuteRemote() == other.getIsMuteRemote() && this.getApplyEntityId() == other.getApplyEntityId() && this.getPropertiesList().equals(other.getPropertiesList()) && this.hasParentAbilityOverride() == other.hasParentAbilityOverride() && (!this.hasParentAbilityOverride() || this.getParentAbilityOverride().equals(other.getParentAbilityOverride())) && this.getUnk2700PMJMNCFJPDC() == other.getUnk2700PMJMNCFJPDC() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasAttachedInstancedModifier()) {
                hash = 37 * hash + 7;
                hash = 53 * hash + this.getAttachedInstancedModifier().hashCode();
            }
            hash = 37 * hash + 4;
            hash = 53 * hash + this.getServerBuffUid();
            hash = 37 * hash + 10;
            hash = 53 * hash + Internal.hashBoolean(this.getIsAttachedParentAbility());
            hash = 37 * hash + 13;
            hash = 53 * hash + this.action_;
            hash = 37 * hash + 2;
            hash = 53 * hash + this.getModifierLocalId();
            if (this.hasParentAbilityName()) {
                hash = 37 * hash + 1;
                hash = 53 * hash + this.getParentAbilityName().hashCode();
            }
            hash = 37 * hash + 6;
            hash = 53 * hash + Internal.hashBoolean(this.getIsMuteRemote());
            hash = 37 * hash + 5;
            hash = 53 * hash + this.getApplyEntityId();
            if (this.getPropertiesCount() > 0) {
                hash = 37 * hash + 3;
                hash = 53 * hash + this.getPropertiesList().hashCode();
            }
            if (this.hasParentAbilityOverride()) {
                hash = 37 * hash + 11;
                hash = 53 * hash + this.getParentAbilityOverride().hashCode();
            }
            hash = 37 * hash + 9;
            hash = 53 * hash + Internal.hashBoolean(this.getUnk2700PMJMNCFJPDC());
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static AbilityMetaModifierChange parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return AbilityMetaModifierChange.PARSER.parseFrom(data);
        }
        
        public static AbilityMetaModifierChange parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AbilityMetaModifierChange.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AbilityMetaModifierChange parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return AbilityMetaModifierChange.PARSER.parseFrom(data);
        }
        
        public static AbilityMetaModifierChange parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AbilityMetaModifierChange.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AbilityMetaModifierChange parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return AbilityMetaModifierChange.PARSER.parseFrom(data);
        }
        
        public static AbilityMetaModifierChange parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AbilityMetaModifierChange.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AbilityMetaModifierChange parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AbilityMetaModifierChange.PARSER, input);
        }
        
        public static AbilityMetaModifierChange parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AbilityMetaModifierChange.PARSER, input, extensionRegistry);
        }
        
        public static AbilityMetaModifierChange parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(AbilityMetaModifierChange.PARSER, input);
        }
        
        public static AbilityMetaModifierChange parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(AbilityMetaModifierChange.PARSER, input, extensionRegistry);
        }
        
        public static AbilityMetaModifierChange parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AbilityMetaModifierChange.PARSER, input);
        }
        
        public static AbilityMetaModifierChange parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AbilityMetaModifierChange.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return AbilityMetaModifierChange.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final AbilityMetaModifierChange prototype) {
            return AbilityMetaModifierChange.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == AbilityMetaModifierChange.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static AbilityMetaModifierChange getDefaultInstance() {
            return AbilityMetaModifierChange.DEFAULT_INSTANCE;
        }
        
        public static Parser<AbilityMetaModifierChange> parser() {
            return AbilityMetaModifierChange.PARSER;
        }
        
        @Override
        public Parser<AbilityMetaModifierChange> getParserForType() {
            return AbilityMetaModifierChange.PARSER;
        }
        
        @Override
        public AbilityMetaModifierChange getDefaultInstanceForType() {
            return AbilityMetaModifierChange.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new AbilityMetaModifierChange();
            PARSER = new AbstractParser<AbilityMetaModifierChange>() {
                @Override
                public AbilityMetaModifierChange parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new AbilityMetaModifierChange(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AbilityMetaModifierChangeOrBuilder
        {
            private int bitField0_;
            private AbilityAttachedModifierOuterClass.AbilityAttachedModifier attachedInstancedModifier_;
            private SingleFieldBuilderV3<AbilityAttachedModifierOuterClass.AbilityAttachedModifier, AbilityAttachedModifierOuterClass.AbilityAttachedModifier.Builder, AbilityAttachedModifierOuterClass.AbilityAttachedModifierOrBuilder> attachedInstancedModifierBuilder_;
            private int serverBuffUid_;
            private boolean isAttachedParentAbility_;
            private int action_;
            private int modifierLocalId_;
            private AbilityStringOuterClass.AbilityString parentAbilityName_;
            private SingleFieldBuilderV3<AbilityStringOuterClass.AbilityString, AbilityStringOuterClass.AbilityString.Builder, AbilityStringOuterClass.AbilityStringOrBuilder> parentAbilityNameBuilder_;
            private boolean isMuteRemote_;
            private int applyEntityId_;
            private List<ModifierPropertyOuterClass.ModifierProperty> properties_;
            private RepeatedFieldBuilderV3<ModifierPropertyOuterClass.ModifierProperty, ModifierPropertyOuterClass.ModifierProperty.Builder, ModifierPropertyOuterClass.ModifierPropertyOrBuilder> propertiesBuilder_;
            private AbilityStringOuterClass.AbilityString parentAbilityOverride_;
            private SingleFieldBuilderV3<AbilityStringOuterClass.AbilityString, AbilityStringOuterClass.AbilityString.Builder, AbilityStringOuterClass.AbilityStringOrBuilder> parentAbilityOverrideBuilder_;
            private boolean unk2700PMJMNCFJPDC_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return AbilityMetaModifierChangeOuterClass.internal_static_AbilityMetaModifierChange_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return AbilityMetaModifierChangeOuterClass.internal_static_AbilityMetaModifierChange_fieldAccessorTable.ensureFieldAccessorsInitialized(AbilityMetaModifierChange.class, Builder.class);
            }
            
            private Builder() {
                this.action_ = 0;
                this.properties_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.action_ = 0;
                this.properties_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (AbilityMetaModifierChange.alwaysUseFieldBuilders) {
                    this.getPropertiesFieldBuilder();
                }
            }
            
            @Override
            public Builder clear() {
                super.clear();
                if (this.attachedInstancedModifierBuilder_ == null) {
                    this.attachedInstancedModifier_ = null;
                }
                else {
                    this.attachedInstancedModifier_ = null;
                    this.attachedInstancedModifierBuilder_ = null;
                }
                this.serverBuffUid_ = 0;
                this.isAttachedParentAbility_ = false;
                this.action_ = 0;
                this.modifierLocalId_ = 0;
                if (this.parentAbilityNameBuilder_ == null) {
                    this.parentAbilityName_ = null;
                }
                else {
                    this.parentAbilityName_ = null;
                    this.parentAbilityNameBuilder_ = null;
                }
                this.isMuteRemote_ = false;
                this.applyEntityId_ = 0;
                if (this.propertiesBuilder_ == null) {
                    this.properties_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                else {
                    this.propertiesBuilder_.clear();
                }
                if (this.parentAbilityOverrideBuilder_ == null) {
                    this.parentAbilityOverride_ = null;
                }
                else {
                    this.parentAbilityOverride_ = null;
                    this.parentAbilityOverrideBuilder_ = null;
                }
                this.unk2700PMJMNCFJPDC_ = false;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return AbilityMetaModifierChangeOuterClass.internal_static_AbilityMetaModifierChange_descriptor;
            }
            
            @Override
            public AbilityMetaModifierChange getDefaultInstanceForType() {
                return AbilityMetaModifierChange.getDefaultInstance();
            }
            
            @Override
            public AbilityMetaModifierChange build() {
                final AbilityMetaModifierChange result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public AbilityMetaModifierChange buildPartial() {
                final AbilityMetaModifierChange result = new AbilityMetaModifierChange(this);
                final int from_bitField0_ = this.bitField0_;
                if (this.attachedInstancedModifierBuilder_ == null) {
                    result.attachedInstancedModifier_ = this.attachedInstancedModifier_;
                }
                else {
                    result.attachedInstancedModifier_ = this.attachedInstancedModifierBuilder_.build();
                }
                result.serverBuffUid_ = this.serverBuffUid_;
                result.isAttachedParentAbility_ = this.isAttachedParentAbility_;
                result.action_ = this.action_;
                result.modifierLocalId_ = this.modifierLocalId_;
                if (this.parentAbilityNameBuilder_ == null) {
                    result.parentAbilityName_ = this.parentAbilityName_;
                }
                else {
                    result.parentAbilityName_ = this.parentAbilityNameBuilder_.build();
                }
                result.isMuteRemote_ = this.isMuteRemote_;
                result.applyEntityId_ = this.applyEntityId_;
                if (this.propertiesBuilder_ == null) {
                    if ((this.bitField0_ & 0x1) != 0x0) {
                        this.properties_ = Collections.unmodifiableList((List<? extends ModifierPropertyOuterClass.ModifierProperty>)this.properties_);
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    result.properties_ = this.properties_;
                }
                else {
                    result.properties_ = this.propertiesBuilder_.build();
                }
                if (this.parentAbilityOverrideBuilder_ == null) {
                    result.parentAbilityOverride_ = this.parentAbilityOverride_;
                }
                else {
                    result.parentAbilityOverride_ = this.parentAbilityOverrideBuilder_.build();
                }
                result.unk2700PMJMNCFJPDC_ = this.unk2700PMJMNCFJPDC_;
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
                if (other instanceof AbilityMetaModifierChange) {
                    return this.mergeFrom((AbilityMetaModifierChange)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final AbilityMetaModifierChange other) {
                if (other == AbilityMetaModifierChange.getDefaultInstance()) {
                    return this;
                }
                if (other.hasAttachedInstancedModifier()) {
                    this.mergeAttachedInstancedModifier(other.getAttachedInstancedModifier());
                }
                if (other.getServerBuffUid() != 0) {
                    this.setServerBuffUid(other.getServerBuffUid());
                }
                if (other.getIsAttachedParentAbility()) {
                    this.setIsAttachedParentAbility(other.getIsAttachedParentAbility());
                }
                if (other.action_ != 0) {
                    this.setActionValue(other.getActionValue());
                }
                if (other.getModifierLocalId() != 0) {
                    this.setModifierLocalId(other.getModifierLocalId());
                }
                if (other.hasParentAbilityName()) {
                    this.mergeParentAbilityName(other.getParentAbilityName());
                }
                if (other.getIsMuteRemote()) {
                    this.setIsMuteRemote(other.getIsMuteRemote());
                }
                if (other.getApplyEntityId() != 0) {
                    this.setApplyEntityId(other.getApplyEntityId());
                }
                if (this.propertiesBuilder_ == null) {
                    if (!other.properties_.isEmpty()) {
                        if (this.properties_.isEmpty()) {
                            this.properties_ = other.properties_;
                            this.bitField0_ &= 0xFFFFFFFE;
                        }
                        else {
                            this.ensurePropertiesIsMutable();
                            this.properties_.addAll(other.properties_);
                        }
                        this.onChanged();
                    }
                }
                else if (!other.properties_.isEmpty()) {
                    if (this.propertiesBuilder_.isEmpty()) {
                        this.propertiesBuilder_.dispose();
                        this.propertiesBuilder_ = null;
                        this.properties_ = other.properties_;
                        this.bitField0_ &= 0xFFFFFFFE;
                        this.propertiesBuilder_ = (AbilityMetaModifierChange.alwaysUseFieldBuilders ? this.getPropertiesFieldBuilder() : null);
                    }
                    else {
                        this.propertiesBuilder_.addAllMessages(other.properties_);
                    }
                }
                if (other.hasParentAbilityOverride()) {
                    this.mergeParentAbilityOverride(other.getParentAbilityOverride());
                }
                if (other.getUnk2700PMJMNCFJPDC()) {
                    this.setUnk2700PMJMNCFJPDC(other.getUnk2700PMJMNCFJPDC());
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
                AbilityMetaModifierChange parsedMessage = null;
                try {
                    parsedMessage = AbilityMetaModifierChange.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (AbilityMetaModifierChange)e.getUnfinishedMessage();
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
            public int getServerBuffUid() {
                return this.serverBuffUid_;
            }
            
            public Builder setServerBuffUid(final int value) {
                this.serverBuffUid_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearServerBuffUid() {
                this.serverBuffUid_ = 0;
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
            public int getActionValue() {
                return this.action_;
            }
            
            public Builder setActionValue(final int value) {
                this.action_ = value;
                this.onChanged();
                return this;
            }
            
            @Override
            public ModifierActionOuterClass.ModifierAction getAction() {
                final ModifierActionOuterClass.ModifierAction result = ModifierActionOuterClass.ModifierAction.valueOf(this.action_);
                return (result == null) ? ModifierActionOuterClass.ModifierAction.UNRECOGNIZED : result;
            }
            
            public Builder setAction(final ModifierActionOuterClass.ModifierAction value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.action_ = value.getNumber();
                this.onChanged();
                return this;
            }
            
            public Builder clearAction() {
                this.action_ = 0;
                this.onChanged();
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
            public boolean getIsMuteRemote() {
                return this.isMuteRemote_;
            }
            
            public Builder setIsMuteRemote(final boolean value) {
                this.isMuteRemote_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearIsMuteRemote() {
                this.isMuteRemote_ = false;
                this.onChanged();
                return this;
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
            
            private void ensurePropertiesIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.properties_ = new ArrayList<ModifierPropertyOuterClass.ModifierProperty>(this.properties_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<ModifierPropertyOuterClass.ModifierProperty> getPropertiesList() {
                if (this.propertiesBuilder_ == null) {
                    return Collections.unmodifiableList((List<? extends ModifierPropertyOuterClass.ModifierProperty>)this.properties_);
                }
                return this.propertiesBuilder_.getMessageList();
            }
            
            @Override
            public int getPropertiesCount() {
                if (this.propertiesBuilder_ == null) {
                    return this.properties_.size();
                }
                return this.propertiesBuilder_.getCount();
            }
            
            @Override
            public ModifierPropertyOuterClass.ModifierProperty getProperties(final int index) {
                if (this.propertiesBuilder_ == null) {
                    return this.properties_.get(index);
                }
                return this.propertiesBuilder_.getMessage(index);
            }
            
            public Builder setProperties(final int index, final ModifierPropertyOuterClass.ModifierProperty value) {
                if (this.propertiesBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensurePropertiesIsMutable();
                    this.properties_.set(index, value);
                    this.onChanged();
                }
                else {
                    this.propertiesBuilder_.setMessage(index, value);
                }
                return this;
            }
            
            public Builder setProperties(final int index, final ModifierPropertyOuterClass.ModifierProperty.Builder builderForValue) {
                if (this.propertiesBuilder_ == null) {
                    this.ensurePropertiesIsMutable();
                    this.properties_.set(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.propertiesBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addProperties(final ModifierPropertyOuterClass.ModifierProperty value) {
                if (this.propertiesBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensurePropertiesIsMutable();
                    this.properties_.add(value);
                    this.onChanged();
                }
                else {
                    this.propertiesBuilder_.addMessage(value);
                }
                return this;
            }
            
            public Builder addProperties(final int index, final ModifierPropertyOuterClass.ModifierProperty value) {
                if (this.propertiesBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensurePropertiesIsMutable();
                    this.properties_.add(index, value);
                    this.onChanged();
                }
                else {
                    this.propertiesBuilder_.addMessage(index, value);
                }
                return this;
            }
            
            public Builder addProperties(final ModifierPropertyOuterClass.ModifierProperty.Builder builderForValue) {
                if (this.propertiesBuilder_ == null) {
                    this.ensurePropertiesIsMutable();
                    this.properties_.add(builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.propertiesBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder addProperties(final int index, final ModifierPropertyOuterClass.ModifierProperty.Builder builderForValue) {
                if (this.propertiesBuilder_ == null) {
                    this.ensurePropertiesIsMutable();
                    this.properties_.add(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.propertiesBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAllProperties(final Iterable<? extends ModifierPropertyOuterClass.ModifierProperty> values) {
                if (this.propertiesBuilder_ == null) {
                    this.ensurePropertiesIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.properties_);
                    this.onChanged();
                }
                else {
                    this.propertiesBuilder_.addAllMessages(values);
                }
                return this;
            }
            
            public Builder clearProperties() {
                if (this.propertiesBuilder_ == null) {
                    this.properties_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                    this.onChanged();
                }
                else {
                    this.propertiesBuilder_.clear();
                }
                return this;
            }
            
            public Builder removeProperties(final int index) {
                if (this.propertiesBuilder_ == null) {
                    this.ensurePropertiesIsMutable();
                    this.properties_.remove(index);
                    this.onChanged();
                }
                else {
                    this.propertiesBuilder_.remove(index);
                }
                return this;
            }
            
            public ModifierPropertyOuterClass.ModifierProperty.Builder getPropertiesBuilder(final int index) {
                return this.getPropertiesFieldBuilder().getBuilder(index);
            }
            
            @Override
            public ModifierPropertyOuterClass.ModifierPropertyOrBuilder getPropertiesOrBuilder(final int index) {
                if (this.propertiesBuilder_ == null) {
                    return this.properties_.get(index);
                }
                return this.propertiesBuilder_.getMessageOrBuilder(index);
            }
            
            @Override
            public List<? extends ModifierPropertyOuterClass.ModifierPropertyOrBuilder> getPropertiesOrBuilderList() {
                if (this.propertiesBuilder_ != null) {
                    return this.propertiesBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList((List<? extends ModifierPropertyOuterClass.ModifierPropertyOrBuilder>)this.properties_);
            }
            
            public ModifierPropertyOuterClass.ModifierProperty.Builder addPropertiesBuilder() {
                return this.getPropertiesFieldBuilder().addBuilder(ModifierPropertyOuterClass.ModifierProperty.getDefaultInstance());
            }
            
            public ModifierPropertyOuterClass.ModifierProperty.Builder addPropertiesBuilder(final int index) {
                return this.getPropertiesFieldBuilder().addBuilder(index, ModifierPropertyOuterClass.ModifierProperty.getDefaultInstance());
            }
            
            public List<ModifierPropertyOuterClass.ModifierProperty.Builder> getPropertiesBuilderList() {
                return this.getPropertiesFieldBuilder().getBuilderList();
            }
            
            private RepeatedFieldBuilderV3<ModifierPropertyOuterClass.ModifierProperty, ModifierPropertyOuterClass.ModifierProperty.Builder, ModifierPropertyOuterClass.ModifierPropertyOrBuilder> getPropertiesFieldBuilder() {
                if (this.propertiesBuilder_ == null) {
                    this.propertiesBuilder_ = new RepeatedFieldBuilderV3<ModifierPropertyOuterClass.ModifierProperty, ModifierPropertyOuterClass.ModifierProperty.Builder, ModifierPropertyOuterClass.ModifierPropertyOrBuilder>(this.properties_, (this.bitField0_ & 0x1) != 0x0, this.getParentForChildren(), this.isClean());
                    this.properties_ = null;
                }
                return this.propertiesBuilder_;
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
            public boolean getUnk2700PMJMNCFJPDC() {
                return this.unk2700PMJMNCFJPDC_;
            }
            
            public Builder setUnk2700PMJMNCFJPDC(final boolean value) {
                this.unk2700PMJMNCFJPDC_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearUnk2700PMJMNCFJPDC() {
                this.unk2700PMJMNCFJPDC_ = false;
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
    
    public interface AbilityMetaModifierChangeOrBuilder extends MessageOrBuilder
    {
        boolean hasAttachedInstancedModifier();
        
        AbilityAttachedModifierOuterClass.AbilityAttachedModifier getAttachedInstancedModifier();
        
        AbilityAttachedModifierOuterClass.AbilityAttachedModifierOrBuilder getAttachedInstancedModifierOrBuilder();
        
        int getServerBuffUid();
        
        boolean getIsAttachedParentAbility();
        
        int getActionValue();
        
        ModifierActionOuterClass.ModifierAction getAction();
        
        int getModifierLocalId();
        
        boolean hasParentAbilityName();
        
        AbilityStringOuterClass.AbilityString getParentAbilityName();
        
        AbilityStringOuterClass.AbilityStringOrBuilder getParentAbilityNameOrBuilder();
        
        boolean getIsMuteRemote();
        
        int getApplyEntityId();
        
        List<ModifierPropertyOuterClass.ModifierProperty> getPropertiesList();
        
        ModifierPropertyOuterClass.ModifierProperty getProperties(final int p0);
        
        int getPropertiesCount();
        
        List<? extends ModifierPropertyOuterClass.ModifierPropertyOrBuilder> getPropertiesOrBuilderList();
        
        ModifierPropertyOuterClass.ModifierPropertyOrBuilder getPropertiesOrBuilder(final int p0);
        
        boolean hasParentAbilityOverride();
        
        AbilityStringOuterClass.AbilityString getParentAbilityOverride();
        
        AbilityStringOuterClass.AbilityStringOrBuilder getParentAbilityOverrideOrBuilder();
        
        boolean getUnk2700PMJMNCFJPDC();
    }
}
