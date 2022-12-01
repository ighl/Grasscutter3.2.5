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

public final class FightPropPairOuterClass
{
    private static final Descriptors.Descriptor internal_static_FightPropPair_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_FightPropPair_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private FightPropPairOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return FightPropPairOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0013FightPropPair.proto\"6\n\rFightPropPair\u0012\u0011\n\tprop_type\u0018\u0001 \u0001(\r\u0012\u0012\n\nprop_value\u0018\u0002 \u0001(\u0002B\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        FightPropPairOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_FightPropPair_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_FightPropPair_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(FightPropPairOuterClass.internal_static_FightPropPair_descriptor, new String[] { "PropType", "PropValue" });
    }
    
    public static final class FightPropPair extends GeneratedMessageV3 implements FightPropPairOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int PROP_TYPE_FIELD_NUMBER = 1;
        private int propType_;
        public static final int PROP_VALUE_FIELD_NUMBER = 2;
        private float propValue_;
        private byte memoizedIsInitialized;
        private static final FightPropPair DEFAULT_INSTANCE;
        private static final Parser<FightPropPair> PARSER;
        
        private FightPropPair(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private FightPropPair() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new FightPropPair();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private FightPropPair(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            this.propType_ = input.readUInt32();
                            continue;
                        }
                        case 21: {
                            this.propValue_ = input.readFloat();
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
            return FightPropPairOuterClass.internal_static_FightPropPair_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return FightPropPairOuterClass.internal_static_FightPropPair_fieldAccessorTable.ensureFieldAccessorsInitialized(FightPropPair.class, Builder.class);
        }
        
        @Override
        public int getPropType() {
            return this.propType_;
        }
        
        @Override
        public float getPropValue() {
            return this.propValue_;
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
            if (this.propType_ != 0) {
                output.writeUInt32(1, this.propType_);
            }
            if (this.propValue_ != 0.0f) {
                output.writeFloat(2, this.propValue_);
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
            if (this.propType_ != 0) {
                size += CodedOutputStream.computeUInt32Size(1, this.propType_);
            }
            if (this.propValue_ != 0.0f) {
                size += CodedOutputStream.computeFloatSize(2, this.propValue_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof FightPropPair)) {
                return super.equals(obj);
            }
            final FightPropPair other = (FightPropPair)obj;
            return this.getPropType() == other.getPropType() && Float.floatToIntBits(this.getPropValue()) == Float.floatToIntBits(other.getPropValue()) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 1;
            hash = 53 * hash + this.getPropType();
            hash = 37 * hash + 2;
            hash = 53 * hash + Float.floatToIntBits(this.getPropValue());
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static FightPropPair parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return FightPropPair.PARSER.parseFrom(data);
        }
        
        public static FightPropPair parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return FightPropPair.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static FightPropPair parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return FightPropPair.PARSER.parseFrom(data);
        }
        
        public static FightPropPair parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return FightPropPair.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static FightPropPair parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return FightPropPair.PARSER.parseFrom(data);
        }
        
        public static FightPropPair parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return FightPropPair.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static FightPropPair parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(FightPropPair.PARSER, input);
        }
        
        public static FightPropPair parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(FightPropPair.PARSER, input, extensionRegistry);
        }
        
        public static FightPropPair parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(FightPropPair.PARSER, input);
        }
        
        public static FightPropPair parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(FightPropPair.PARSER, input, extensionRegistry);
        }
        
        public static FightPropPair parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(FightPropPair.PARSER, input);
        }
        
        public static FightPropPair parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(FightPropPair.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return FightPropPair.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final FightPropPair prototype) {
            return FightPropPair.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == FightPropPair.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static FightPropPair getDefaultInstance() {
            return FightPropPair.DEFAULT_INSTANCE;
        }
        
        public static Parser<FightPropPair> parser() {
            return FightPropPair.PARSER;
        }
        
        @Override
        public Parser<FightPropPair> getParserForType() {
            return FightPropPair.PARSER;
        }
        
        @Override
        public FightPropPair getDefaultInstanceForType() {
            return FightPropPair.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new FightPropPair();
            PARSER = new AbstractParser<FightPropPair>() {
                @Override
                public FightPropPair parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new FightPropPair(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements FightPropPairOrBuilder
        {
            private int propType_;
            private float propValue_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return FightPropPairOuterClass.internal_static_FightPropPair_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return FightPropPairOuterClass.internal_static_FightPropPair_fieldAccessorTable.ensureFieldAccessorsInitialized(FightPropPair.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (FightPropPair.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.propType_ = 0;
                this.propValue_ = 0.0f;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return FightPropPairOuterClass.internal_static_FightPropPair_descriptor;
            }
            
            @Override
            public FightPropPair getDefaultInstanceForType() {
                return FightPropPair.getDefaultInstance();
            }
            
            @Override
            public FightPropPair build() {
                final FightPropPair result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public FightPropPair buildPartial() {
                final FightPropPair result = new FightPropPair(this);
                result.propType_ = this.propType_;
                result.propValue_ = this.propValue_;
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
                if (other instanceof FightPropPair) {
                    return this.mergeFrom((FightPropPair)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final FightPropPair other) {
                if (other == FightPropPair.getDefaultInstance()) {
                    return this;
                }
                if (other.getPropType() != 0) {
                    this.setPropType(other.getPropType());
                }
                if (other.getPropValue() != 0.0f) {
                    this.setPropValue(other.getPropValue());
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
                FightPropPair parsedMessage = null;
                try {
                    parsedMessage = FightPropPair.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (FightPropPair)e.getUnfinishedMessage();
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
            public int getPropType() {
                return this.propType_;
            }
            
            public Builder setPropType(final int value) {
                this.propType_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearPropType() {
                this.propType_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public float getPropValue() {
                return this.propValue_;
            }
            
            public Builder setPropValue(final float value) {
                this.propValue_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearPropValue() {
                this.propValue_ = 0.0f;
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
    
    public interface FightPropPairOrBuilder extends MessageOrBuilder
    {
        int getPropType();
        
        float getPropValue();
    }
}
