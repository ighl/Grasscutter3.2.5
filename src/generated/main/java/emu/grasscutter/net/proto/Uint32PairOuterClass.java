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

public final class Uint32PairOuterClass
{
    private static final Descriptors.Descriptor internal_static_Uint32Pair_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_Uint32Pair_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private Uint32PairOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return Uint32PairOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0010Uint32Pair.proto\"(\n\nUint32Pair\u0012\u000b\n\u0003key\u0018\u0001 \u0001(\r\u0012\r\n\u0005value\u0018\u0002 \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        Uint32PairOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_Uint32Pair_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_Uint32Pair_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(Uint32PairOuterClass.internal_static_Uint32Pair_descriptor, new String[] { "Key", "Value" });
    }
    
    public static final class Uint32Pair extends GeneratedMessageV3 implements Uint32PairOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int KEY_FIELD_NUMBER = 1;
        private int key_;
        public static final int VALUE_FIELD_NUMBER = 2;
        private int value_;
        private byte memoizedIsInitialized;
        private static final Uint32Pair DEFAULT_INSTANCE;
        private static final Parser<Uint32Pair> PARSER;
        
        private Uint32Pair(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private Uint32Pair() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new Uint32Pair();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private Uint32Pair(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            this.key_ = input.readUInt32();
                            continue;
                        }
                        case 16: {
                            this.value_ = input.readUInt32();
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
            return Uint32PairOuterClass.internal_static_Uint32Pair_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return Uint32PairOuterClass.internal_static_Uint32Pair_fieldAccessorTable.ensureFieldAccessorsInitialized(Uint32Pair.class, Builder.class);
        }
        
        @Override
        public int getKey() {
            return this.key_;
        }
        
        @Override
        public int getValue() {
            return this.value_;
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
            if (this.key_ != 0) {
                output.writeUInt32(1, this.key_);
            }
            if (this.value_ != 0) {
                output.writeUInt32(2, this.value_);
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
            if (this.key_ != 0) {
                size += CodedOutputStream.computeUInt32Size(1, this.key_);
            }
            if (this.value_ != 0) {
                size += CodedOutputStream.computeUInt32Size(2, this.value_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Uint32Pair)) {
                return super.equals(obj);
            }
            final Uint32Pair other = (Uint32Pair)obj;
            return this.getKey() == other.getKey() && this.getValue() == other.getValue() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 1;
            hash = 53 * hash + this.getKey();
            hash = 37 * hash + 2;
            hash = 53 * hash + this.getValue();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static Uint32Pair parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return Uint32Pair.PARSER.parseFrom(data);
        }
        
        public static Uint32Pair parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return Uint32Pair.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static Uint32Pair parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return Uint32Pair.PARSER.parseFrom(data);
        }
        
        public static Uint32Pair parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return Uint32Pair.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static Uint32Pair parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return Uint32Pair.PARSER.parseFrom(data);
        }
        
        public static Uint32Pair parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return Uint32Pair.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static Uint32Pair parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(Uint32Pair.PARSER, input);
        }
        
        public static Uint32Pair parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(Uint32Pair.PARSER, input, extensionRegistry);
        }
        
        public static Uint32Pair parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(Uint32Pair.PARSER, input);
        }
        
        public static Uint32Pair parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(Uint32Pair.PARSER, input, extensionRegistry);
        }
        
        public static Uint32Pair parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(Uint32Pair.PARSER, input);
        }
        
        public static Uint32Pair parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(Uint32Pair.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return Uint32Pair.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final Uint32Pair prototype) {
            return Uint32Pair.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == Uint32Pair.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static Uint32Pair getDefaultInstance() {
            return Uint32Pair.DEFAULT_INSTANCE;
        }
        
        public static Parser<Uint32Pair> parser() {
            return Uint32Pair.PARSER;
        }
        
        @Override
        public Parser<Uint32Pair> getParserForType() {
            return Uint32Pair.PARSER;
        }
        
        @Override
        public Uint32Pair getDefaultInstanceForType() {
            return Uint32Pair.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new Uint32Pair();
            PARSER = new AbstractParser<Uint32Pair>() {
                @Override
                public Uint32Pair parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new Uint32Pair(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements Uint32PairOrBuilder
        {
            private int key_;
            private int value_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return Uint32PairOuterClass.internal_static_Uint32Pair_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return Uint32PairOuterClass.internal_static_Uint32Pair_fieldAccessorTable.ensureFieldAccessorsInitialized(Uint32Pair.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (Uint32Pair.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.key_ = 0;
                this.value_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return Uint32PairOuterClass.internal_static_Uint32Pair_descriptor;
            }
            
            @Override
            public Uint32Pair getDefaultInstanceForType() {
                return Uint32Pair.getDefaultInstance();
            }
            
            @Override
            public Uint32Pair build() {
                final Uint32Pair result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public Uint32Pair buildPartial() {
                final Uint32Pair result = new Uint32Pair(this);
                result.key_ = this.key_;
                result.value_ = this.value_;
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
                if (other instanceof Uint32Pair) {
                    return this.mergeFrom((Uint32Pair)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final Uint32Pair other) {
                if (other == Uint32Pair.getDefaultInstance()) {
                    return this;
                }
                if (other.getKey() != 0) {
                    this.setKey(other.getKey());
                }
                if (other.getValue() != 0) {
                    this.setValue(other.getValue());
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
                Uint32Pair parsedMessage = null;
                try {
                    parsedMessage = Uint32Pair.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (Uint32Pair)e.getUnfinishedMessage();
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
            public int getKey() {
                return this.key_;
            }
            
            public Builder setKey(final int value) {
                this.key_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearKey() {
                this.key_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getValue() {
                return this.value_;
            }
            
            public Builder setValue(final int value) {
                this.value_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearValue() {
                this.value_ = 0;
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
    
    public interface Uint32PairOrBuilder extends MessageOrBuilder
    {
        int getKey();
        
        int getValue();
    }
}
