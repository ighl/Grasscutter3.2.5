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

public final class AbilityEmbryoOuterClass
{
    private static final Descriptors.Descriptor internal_static_AbilityEmbryo_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_AbilityEmbryo_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private AbilityEmbryoOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return AbilityEmbryoOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0013AbilityEmbryo.proto\"b\n\rAbilityEmbryo\u0012\u0012\n\nability_id\u0018\u0001 \u0001(\r\u0012\u0019\n\u0011ability_name_hash\u0018\u0002 \u0001(\u0007\u0012\"\n\u001aability_override_name_hash\u0018\u0003 \u0001(\u0007B\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        AbilityEmbryoOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_AbilityEmbryo_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_AbilityEmbryo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(AbilityEmbryoOuterClass.internal_static_AbilityEmbryo_descriptor, new String[] { "AbilityId", "AbilityNameHash", "AbilityOverrideNameHash" });
    }
    
    public static final class AbilityEmbryo extends GeneratedMessageV3 implements AbilityEmbryoOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int ABILITY_ID_FIELD_NUMBER = 1;
        private int abilityId_;
        public static final int ABILITY_NAME_HASH_FIELD_NUMBER = 2;
        private int abilityNameHash_;
        public static final int ABILITY_OVERRIDE_NAME_HASH_FIELD_NUMBER = 3;
        private int abilityOverrideNameHash_;
        private byte memoizedIsInitialized;
        private static final AbilityEmbryo DEFAULT_INSTANCE;
        private static final Parser<AbilityEmbryo> PARSER;
        
        private AbilityEmbryo(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private AbilityEmbryo() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new AbilityEmbryo();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private AbilityEmbryo(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            this.abilityId_ = input.readUInt32();
                            continue;
                        }
                        case 21: {
                            this.abilityNameHash_ = input.readFixed32();
                            continue;
                        }
                        case 29: {
                            this.abilityOverrideNameHash_ = input.readFixed32();
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
            return AbilityEmbryoOuterClass.internal_static_AbilityEmbryo_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return AbilityEmbryoOuterClass.internal_static_AbilityEmbryo_fieldAccessorTable.ensureFieldAccessorsInitialized(AbilityEmbryo.class, Builder.class);
        }
        
        @Override
        public int getAbilityId() {
            return this.abilityId_;
        }
        
        @Override
        public int getAbilityNameHash() {
            return this.abilityNameHash_;
        }
        
        @Override
        public int getAbilityOverrideNameHash() {
            return this.abilityOverrideNameHash_;
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
            if (this.abilityId_ != 0) {
                output.writeUInt32(1, this.abilityId_);
            }
            if (this.abilityNameHash_ != 0) {
                output.writeFixed32(2, this.abilityNameHash_);
            }
            if (this.abilityOverrideNameHash_ != 0) {
                output.writeFixed32(3, this.abilityOverrideNameHash_);
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
            if (this.abilityId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(1, this.abilityId_);
            }
            if (this.abilityNameHash_ != 0) {
                size += CodedOutputStream.computeFixed32Size(2, this.abilityNameHash_);
            }
            if (this.abilityOverrideNameHash_ != 0) {
                size += CodedOutputStream.computeFixed32Size(3, this.abilityOverrideNameHash_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AbilityEmbryo)) {
                return super.equals(obj);
            }
            final AbilityEmbryo other = (AbilityEmbryo)obj;
            return this.getAbilityId() == other.getAbilityId() && this.getAbilityNameHash() == other.getAbilityNameHash() && this.getAbilityOverrideNameHash() == other.getAbilityOverrideNameHash() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 1;
            hash = 53 * hash + this.getAbilityId();
            hash = 37 * hash + 2;
            hash = 53 * hash + this.getAbilityNameHash();
            hash = 37 * hash + 3;
            hash = 53 * hash + this.getAbilityOverrideNameHash();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static AbilityEmbryo parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return AbilityEmbryo.PARSER.parseFrom(data);
        }
        
        public static AbilityEmbryo parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AbilityEmbryo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AbilityEmbryo parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return AbilityEmbryo.PARSER.parseFrom(data);
        }
        
        public static AbilityEmbryo parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AbilityEmbryo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AbilityEmbryo parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return AbilityEmbryo.PARSER.parseFrom(data);
        }
        
        public static AbilityEmbryo parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AbilityEmbryo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AbilityEmbryo parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AbilityEmbryo.PARSER, input);
        }
        
        public static AbilityEmbryo parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AbilityEmbryo.PARSER, input, extensionRegistry);
        }
        
        public static AbilityEmbryo parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(AbilityEmbryo.PARSER, input);
        }
        
        public static AbilityEmbryo parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(AbilityEmbryo.PARSER, input, extensionRegistry);
        }
        
        public static AbilityEmbryo parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AbilityEmbryo.PARSER, input);
        }
        
        public static AbilityEmbryo parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AbilityEmbryo.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return AbilityEmbryo.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final AbilityEmbryo prototype) {
            return AbilityEmbryo.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == AbilityEmbryo.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static AbilityEmbryo getDefaultInstance() {
            return AbilityEmbryo.DEFAULT_INSTANCE;
        }
        
        public static Parser<AbilityEmbryo> parser() {
            return AbilityEmbryo.PARSER;
        }
        
        @Override
        public Parser<AbilityEmbryo> getParserForType() {
            return AbilityEmbryo.PARSER;
        }
        
        @Override
        public AbilityEmbryo getDefaultInstanceForType() {
            return AbilityEmbryo.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new AbilityEmbryo();
            PARSER = new AbstractParser<AbilityEmbryo>() {
                @Override
                public AbilityEmbryo parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new AbilityEmbryo(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AbilityEmbryoOrBuilder
        {
            private int abilityId_;
            private int abilityNameHash_;
            private int abilityOverrideNameHash_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return AbilityEmbryoOuterClass.internal_static_AbilityEmbryo_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return AbilityEmbryoOuterClass.internal_static_AbilityEmbryo_fieldAccessorTable.ensureFieldAccessorsInitialized(AbilityEmbryo.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (AbilityEmbryo.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.abilityId_ = 0;
                this.abilityNameHash_ = 0;
                this.abilityOverrideNameHash_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return AbilityEmbryoOuterClass.internal_static_AbilityEmbryo_descriptor;
            }
            
            @Override
            public AbilityEmbryo getDefaultInstanceForType() {
                return AbilityEmbryo.getDefaultInstance();
            }
            
            @Override
            public AbilityEmbryo build() {
                final AbilityEmbryo result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public AbilityEmbryo buildPartial() {
                final AbilityEmbryo result = new AbilityEmbryo(this);
                result.abilityId_ = this.abilityId_;
                result.abilityNameHash_ = this.abilityNameHash_;
                result.abilityOverrideNameHash_ = this.abilityOverrideNameHash_;
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
                if (other instanceof AbilityEmbryo) {
                    return this.mergeFrom((AbilityEmbryo)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final AbilityEmbryo other) {
                if (other == AbilityEmbryo.getDefaultInstance()) {
                    return this;
                }
                if (other.getAbilityId() != 0) {
                    this.setAbilityId(other.getAbilityId());
                }
                if (other.getAbilityNameHash() != 0) {
                    this.setAbilityNameHash(other.getAbilityNameHash());
                }
                if (other.getAbilityOverrideNameHash() != 0) {
                    this.setAbilityOverrideNameHash(other.getAbilityOverrideNameHash());
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
                AbilityEmbryo parsedMessage = null;
                try {
                    parsedMessage = AbilityEmbryo.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (AbilityEmbryo)e.getUnfinishedMessage();
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
            public int getAbilityId() {
                return this.abilityId_;
            }
            
            public Builder setAbilityId(final int value) {
                this.abilityId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearAbilityId() {
                this.abilityId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getAbilityNameHash() {
                return this.abilityNameHash_;
            }
            
            public Builder setAbilityNameHash(final int value) {
                this.abilityNameHash_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearAbilityNameHash() {
                this.abilityNameHash_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getAbilityOverrideNameHash() {
                return this.abilityOverrideNameHash_;
            }
            
            public Builder setAbilityOverrideNameHash(final int value) {
                this.abilityOverrideNameHash_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearAbilityOverrideNameHash() {
                this.abilityOverrideNameHash_ = 0;
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
    
    public interface AbilityEmbryoOrBuilder extends MessageOrBuilder
    {
        int getAbilityId();
        
        int getAbilityNameHash();
        
        int getAbilityOverrideNameHash();
    }
}
