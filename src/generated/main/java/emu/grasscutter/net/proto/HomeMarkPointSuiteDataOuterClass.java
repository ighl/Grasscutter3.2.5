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

public final class HomeMarkPointSuiteDataOuterClass
{
    private static final Descriptors.Descriptor internal_static_HomeMarkPointSuiteData_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_HomeMarkPointSuiteData_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private HomeMarkPointSuiteDataOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return HomeMarkPointSuiteDataOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u001cHomeMarkPointSuiteData.proto\"*\n\u0016HomeMarkPointSuiteData\u0012\u0010\n\bsuite_id\u0018\u0001 \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        HomeMarkPointSuiteDataOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_HomeMarkPointSuiteData_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_HomeMarkPointSuiteData_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(HomeMarkPointSuiteDataOuterClass.internal_static_HomeMarkPointSuiteData_descriptor, new String[] { "SuiteId" });
    }
    
    public static final class HomeMarkPointSuiteData extends GeneratedMessageV3 implements HomeMarkPointSuiteDataOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int SUITE_ID_FIELD_NUMBER = 1;
        private int suiteId_;
        private byte memoizedIsInitialized;
        private static final HomeMarkPointSuiteData DEFAULT_INSTANCE;
        private static final Parser<HomeMarkPointSuiteData> PARSER;
        
        private HomeMarkPointSuiteData(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private HomeMarkPointSuiteData() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new HomeMarkPointSuiteData();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private HomeMarkPointSuiteData(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            this.suiteId_ = input.readUInt32();
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
            return HomeMarkPointSuiteDataOuterClass.internal_static_HomeMarkPointSuiteData_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return HomeMarkPointSuiteDataOuterClass.internal_static_HomeMarkPointSuiteData_fieldAccessorTable.ensureFieldAccessorsInitialized(HomeMarkPointSuiteData.class, Builder.class);
        }
        
        @Override
        public int getSuiteId() {
            return this.suiteId_;
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
            if (this.suiteId_ != 0) {
                output.writeUInt32(1, this.suiteId_);
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
            if (this.suiteId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(1, this.suiteId_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof HomeMarkPointSuiteData)) {
                return super.equals(obj);
            }
            final HomeMarkPointSuiteData other = (HomeMarkPointSuiteData)obj;
            return this.getSuiteId() == other.getSuiteId() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 1;
            hash = 53 * hash + this.getSuiteId();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static HomeMarkPointSuiteData parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return HomeMarkPointSuiteData.PARSER.parseFrom(data);
        }
        
        public static HomeMarkPointSuiteData parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return HomeMarkPointSuiteData.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static HomeMarkPointSuiteData parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return HomeMarkPointSuiteData.PARSER.parseFrom(data);
        }
        
        public static HomeMarkPointSuiteData parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return HomeMarkPointSuiteData.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static HomeMarkPointSuiteData parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return HomeMarkPointSuiteData.PARSER.parseFrom(data);
        }
        
        public static HomeMarkPointSuiteData parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return HomeMarkPointSuiteData.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static HomeMarkPointSuiteData parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(HomeMarkPointSuiteData.PARSER, input);
        }
        
        public static HomeMarkPointSuiteData parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(HomeMarkPointSuiteData.PARSER, input, extensionRegistry);
        }
        
        public static HomeMarkPointSuiteData parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(HomeMarkPointSuiteData.PARSER, input);
        }
        
        public static HomeMarkPointSuiteData parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(HomeMarkPointSuiteData.PARSER, input, extensionRegistry);
        }
        
        public static HomeMarkPointSuiteData parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(HomeMarkPointSuiteData.PARSER, input);
        }
        
        public static HomeMarkPointSuiteData parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(HomeMarkPointSuiteData.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return HomeMarkPointSuiteData.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final HomeMarkPointSuiteData prototype) {
            return HomeMarkPointSuiteData.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == HomeMarkPointSuiteData.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static HomeMarkPointSuiteData getDefaultInstance() {
            return HomeMarkPointSuiteData.DEFAULT_INSTANCE;
        }
        
        public static Parser<HomeMarkPointSuiteData> parser() {
            return HomeMarkPointSuiteData.PARSER;
        }
        
        @Override
        public Parser<HomeMarkPointSuiteData> getParserForType() {
            return HomeMarkPointSuiteData.PARSER;
        }
        
        @Override
        public HomeMarkPointSuiteData getDefaultInstanceForType() {
            return HomeMarkPointSuiteData.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new HomeMarkPointSuiteData();
            PARSER = new AbstractParser<HomeMarkPointSuiteData>() {
                @Override
                public HomeMarkPointSuiteData parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new HomeMarkPointSuiteData(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements HomeMarkPointSuiteDataOrBuilder
        {
            private int suiteId_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return HomeMarkPointSuiteDataOuterClass.internal_static_HomeMarkPointSuiteData_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return HomeMarkPointSuiteDataOuterClass.internal_static_HomeMarkPointSuiteData_fieldAccessorTable.ensureFieldAccessorsInitialized(HomeMarkPointSuiteData.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (HomeMarkPointSuiteData.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.suiteId_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return HomeMarkPointSuiteDataOuterClass.internal_static_HomeMarkPointSuiteData_descriptor;
            }
            
            @Override
            public HomeMarkPointSuiteData getDefaultInstanceForType() {
                return HomeMarkPointSuiteData.getDefaultInstance();
            }
            
            @Override
            public HomeMarkPointSuiteData build() {
                final HomeMarkPointSuiteData result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public HomeMarkPointSuiteData buildPartial() {
                final HomeMarkPointSuiteData result = new HomeMarkPointSuiteData(this);
                result.suiteId_ = this.suiteId_;
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
                if (other instanceof HomeMarkPointSuiteData) {
                    return this.mergeFrom((HomeMarkPointSuiteData)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final HomeMarkPointSuiteData other) {
                if (other == HomeMarkPointSuiteData.getDefaultInstance()) {
                    return this;
                }
                if (other.getSuiteId() != 0) {
                    this.setSuiteId(other.getSuiteId());
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
                HomeMarkPointSuiteData parsedMessage = null;
                try {
                    parsedMessage = HomeMarkPointSuiteData.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (HomeMarkPointSuiteData)e.getUnfinishedMessage();
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
            public int getSuiteId() {
                return this.suiteId_;
            }
            
            public Builder setSuiteId(final int value) {
                this.suiteId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearSuiteId() {
                this.suiteId_ = 0;
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
    
    public interface HomeMarkPointSuiteDataOrBuilder extends MessageOrBuilder
    {
        int getSuiteId();
    }
}
