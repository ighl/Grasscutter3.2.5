// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractMessage;
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

public final class AbilityAttachedModifierOuterClass
{
    private static final Descriptors.Descriptor internal_static_AbilityAttachedModifier_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_AbilityAttachedModifier_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private AbilityAttachedModifierOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return AbilityAttachedModifierOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u001dAbilityAttachedModifier.proto\"\u009f\u0001\n\u0017AbilityAttachedModifier\u0012\u0012\n\nis_invalid\u0018\u0001 \u0001(\b\u0012\u0017\n\u000fowner_entity_id\u0018\u0002 \u0001(\r\u0012\u001d\n\u0015instanced_modifier_id\u0018\u0003 \u0001(\r\u0012\u001e\n\u0016is_serverbuff_modifier\u0018\u0004 \u0001(\b\u0012\u0018\n\u0010attach_name_hash\u0018\u0005 \u0001(\u0005B\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        AbilityAttachedModifierOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_AbilityAttachedModifier_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_AbilityAttachedModifier_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(AbilityAttachedModifierOuterClass.internal_static_AbilityAttachedModifier_descriptor, new String[] { "IsInvalid", "OwnerEntityId", "InstancedModifierId", "IsServerbuffModifier", "AttachNameHash" });
    }
    
    public static final class AbilityAttachedModifier extends GeneratedMessageV3 implements AbilityAttachedModifierOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int IS_INVALID_FIELD_NUMBER = 1;
        private boolean isInvalid_;
        public static final int OWNER_ENTITY_ID_FIELD_NUMBER = 2;
        private int ownerEntityId_;
        public static final int INSTANCED_MODIFIER_ID_FIELD_NUMBER = 3;
        private int instancedModifierId_;
        public static final int IS_SERVERBUFF_MODIFIER_FIELD_NUMBER = 4;
        private boolean isServerbuffModifier_;
        public static final int ATTACH_NAME_HASH_FIELD_NUMBER = 5;
        private int attachNameHash_;
        private byte memoizedIsInitialized;
        private static final AbilityAttachedModifier DEFAULT_INSTANCE;
        private static final Parser<AbilityAttachedModifier> PARSER;
        
        private AbilityAttachedModifier(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private AbilityAttachedModifier() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new AbilityAttachedModifier();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private AbilityAttachedModifier(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            this.isInvalid_ = input.readBool();
                            continue;
                        }
                        case 16: {
                            this.ownerEntityId_ = input.readUInt32();
                            continue;
                        }
                        case 24: {
                            this.instancedModifierId_ = input.readUInt32();
                            continue;
                        }
                        case 32: {
                            this.isServerbuffModifier_ = input.readBool();
                            continue;
                        }
                        case 40: {
                            this.attachNameHash_ = input.readInt32();
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
            return AbilityAttachedModifierOuterClass.internal_static_AbilityAttachedModifier_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return AbilityAttachedModifierOuterClass.internal_static_AbilityAttachedModifier_fieldAccessorTable.ensureFieldAccessorsInitialized(AbilityAttachedModifier.class, Builder.class);
        }
        
        @Override
        public boolean getIsInvalid() {
            return this.isInvalid_;
        }
        
        @Override
        public int getOwnerEntityId() {
            return this.ownerEntityId_;
        }
        
        @Override
        public int getInstancedModifierId() {
            return this.instancedModifierId_;
        }
        
        @Override
        public boolean getIsServerbuffModifier() {
            return this.isServerbuffModifier_;
        }
        
        @Override
        public int getAttachNameHash() {
            return this.attachNameHash_;
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
            if (this.isInvalid_) {
                output.writeBool(1, this.isInvalid_);
            }
            if (this.ownerEntityId_ != 0) {
                output.writeUInt32(2, this.ownerEntityId_);
            }
            if (this.instancedModifierId_ != 0) {
                output.writeUInt32(3, this.instancedModifierId_);
            }
            if (this.isServerbuffModifier_) {
                output.writeBool(4, this.isServerbuffModifier_);
            }
            if (this.attachNameHash_ != 0) {
                output.writeInt32(5, this.attachNameHash_);
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
            if (this.isInvalid_) {
                size += CodedOutputStream.computeBoolSize(1, this.isInvalid_);
            }
            if (this.ownerEntityId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(2, this.ownerEntityId_);
            }
            if (this.instancedModifierId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(3, this.instancedModifierId_);
            }
            if (this.isServerbuffModifier_) {
                size += CodedOutputStream.computeBoolSize(4, this.isServerbuffModifier_);
            }
            if (this.attachNameHash_ != 0) {
                size += CodedOutputStream.computeInt32Size(5, this.attachNameHash_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AbilityAttachedModifier)) {
                return super.equals(obj);
            }
            final AbilityAttachedModifier other = (AbilityAttachedModifier)obj;
            return this.getIsInvalid() == other.getIsInvalid() && this.getOwnerEntityId() == other.getOwnerEntityId() && this.getInstancedModifierId() == other.getInstancedModifierId() && this.getIsServerbuffModifier() == other.getIsServerbuffModifier() && this.getAttachNameHash() == other.getAttachNameHash() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 1;
            hash = 53 * hash + Internal.hashBoolean(this.getIsInvalid());
            hash = 37 * hash + 2;
            hash = 53 * hash + this.getOwnerEntityId();
            hash = 37 * hash + 3;
            hash = 53 * hash + this.getInstancedModifierId();
            hash = 37 * hash + 4;
            hash = 53 * hash + Internal.hashBoolean(this.getIsServerbuffModifier());
            hash = 37 * hash + 5;
            hash = 53 * hash + this.getAttachNameHash();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static AbilityAttachedModifier parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return AbilityAttachedModifier.PARSER.parseFrom(data);
        }
        
        public static AbilityAttachedModifier parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AbilityAttachedModifier.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AbilityAttachedModifier parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return AbilityAttachedModifier.PARSER.parseFrom(data);
        }
        
        public static AbilityAttachedModifier parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AbilityAttachedModifier.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AbilityAttachedModifier parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return AbilityAttachedModifier.PARSER.parseFrom(data);
        }
        
        public static AbilityAttachedModifier parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AbilityAttachedModifier.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AbilityAttachedModifier parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AbilityAttachedModifier.PARSER, input);
        }
        
        public static AbilityAttachedModifier parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AbilityAttachedModifier.PARSER, input, extensionRegistry);
        }
        
        public static AbilityAttachedModifier parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(AbilityAttachedModifier.PARSER, input);
        }
        
        public static AbilityAttachedModifier parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(AbilityAttachedModifier.PARSER, input, extensionRegistry);
        }
        
        public static AbilityAttachedModifier parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AbilityAttachedModifier.PARSER, input);
        }
        
        public static AbilityAttachedModifier parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AbilityAttachedModifier.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return AbilityAttachedModifier.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final AbilityAttachedModifier prototype) {
            return AbilityAttachedModifier.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == AbilityAttachedModifier.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static AbilityAttachedModifier getDefaultInstance() {
            return AbilityAttachedModifier.DEFAULT_INSTANCE;
        }
        
        public static Parser<AbilityAttachedModifier> parser() {
            return AbilityAttachedModifier.PARSER;
        }
        
        @Override
        public Parser<AbilityAttachedModifier> getParserForType() {
            return AbilityAttachedModifier.PARSER;
        }
        
        @Override
        public AbilityAttachedModifier getDefaultInstanceForType() {
            return AbilityAttachedModifier.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new AbilityAttachedModifier();
            PARSER = new AbstractParser<AbilityAttachedModifier>() {
                @Override
                public AbilityAttachedModifier parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new AbilityAttachedModifier(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AbilityAttachedModifierOrBuilder
        {
            private boolean isInvalid_;
            private int ownerEntityId_;
            private int instancedModifierId_;
            private boolean isServerbuffModifier_;
            private int attachNameHash_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return AbilityAttachedModifierOuterClass.internal_static_AbilityAttachedModifier_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return AbilityAttachedModifierOuterClass.internal_static_AbilityAttachedModifier_fieldAccessorTable.ensureFieldAccessorsInitialized(AbilityAttachedModifier.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (AbilityAttachedModifier.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.isInvalid_ = false;
                this.ownerEntityId_ = 0;
                this.instancedModifierId_ = 0;
                this.isServerbuffModifier_ = false;
                this.attachNameHash_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return AbilityAttachedModifierOuterClass.internal_static_AbilityAttachedModifier_descriptor;
            }
            
            @Override
            public AbilityAttachedModifier getDefaultInstanceForType() {
                return AbilityAttachedModifier.getDefaultInstance();
            }
            
            @Override
            public AbilityAttachedModifier build() {
                final AbilityAttachedModifier result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public AbilityAttachedModifier buildPartial() {
                final AbilityAttachedModifier result = new AbilityAttachedModifier(this);
                result.isInvalid_ = this.isInvalid_;
                result.ownerEntityId_ = this.ownerEntityId_;
                result.instancedModifierId_ = this.instancedModifierId_;
                result.isServerbuffModifier_ = this.isServerbuffModifier_;
                result.attachNameHash_ = this.attachNameHash_;
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
                if (other instanceof AbilityAttachedModifier) {
                    return this.mergeFrom((AbilityAttachedModifier)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final AbilityAttachedModifier other) {
                if (other == AbilityAttachedModifier.getDefaultInstance()) {
                    return this;
                }
                if (other.getIsInvalid()) {
                    this.setIsInvalid(other.getIsInvalid());
                }
                if (other.getOwnerEntityId() != 0) {
                    this.setOwnerEntityId(other.getOwnerEntityId());
                }
                if (other.getInstancedModifierId() != 0) {
                    this.setInstancedModifierId(other.getInstancedModifierId());
                }
                if (other.getIsServerbuffModifier()) {
                    this.setIsServerbuffModifier(other.getIsServerbuffModifier());
                }
                if (other.getAttachNameHash() != 0) {
                    this.setAttachNameHash(other.getAttachNameHash());
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
                AbilityAttachedModifier parsedMessage = null;
                try {
                    parsedMessage = AbilityAttachedModifier.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (AbilityAttachedModifier)e.getUnfinishedMessage();
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
            public boolean getIsInvalid() {
                return this.isInvalid_;
            }
            
            public Builder setIsInvalid(final boolean value) {
                this.isInvalid_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearIsInvalid() {
                this.isInvalid_ = false;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getOwnerEntityId() {
                return this.ownerEntityId_;
            }
            
            public Builder setOwnerEntityId(final int value) {
                this.ownerEntityId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearOwnerEntityId() {
                this.ownerEntityId_ = 0;
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
            public int getAttachNameHash() {
                return this.attachNameHash_;
            }
            
            public Builder setAttachNameHash(final int value) {
                this.attachNameHash_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearAttachNameHash() {
                this.attachNameHash_ = 0;
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
    
    public interface AbilityAttachedModifierOrBuilder extends MessageOrBuilder
    {
        boolean getIsInvalid();
        
        int getOwnerEntityId();
        
        int getInstancedModifierId();
        
        boolean getIsServerbuffModifier();
        
        int getAttachNameHash();
    }
}
