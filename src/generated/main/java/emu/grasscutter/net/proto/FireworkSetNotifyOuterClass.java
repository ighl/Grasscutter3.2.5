// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import java.util.Collection;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.Message;
import java.io.InputStream;
import com.google.protobuf.ByteString;
import java.nio.ByteBuffer;
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

public final class FireworkSetNotifyOuterClass
{
    private static final Descriptors.Descriptor internal_static_FireworkSetNotify_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_FireworkSetNotify_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private FireworkSetNotifyOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return FireworkSetNotifyOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0017FireworkSetNotify.proto\u001a\u0015FireworkSetData.proto\"A\n\u0011FireworkSetNotify\u0012\f\n\u0004code\u0018\u0001 \u0001(\r\u0012\u001e\n\u0004data\u0018\t \u0003(\u000b2\u0010.FireworkSetDataB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        FireworkSetNotifyOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { FireworkSetDataOuterClass.getDescriptor() });
        internal_static_FireworkSetNotify_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_FireworkSetNotify_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(FireworkSetNotifyOuterClass.internal_static_FireworkSetNotify_descriptor, new String[] { "Code", "Data" });
        FireworkSetDataOuterClass.getDescriptor();
    }
    
    public static final class FireworkSetNotify extends GeneratedMessageV3 implements FireworkSetNotifyOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int CODE_FIELD_NUMBER = 1;
        private int code_;
        public static final int DATA_FIELD_NUMBER = 9;
        private List<FireworkSetDataOuterClass.FireworkSetData> data_;
        private byte memoizedIsInitialized;
        private static final FireworkSetNotify DEFAULT_INSTANCE;
        private static final Parser<FireworkSetNotify> PARSER;
        
        private FireworkSetNotify(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private FireworkSetNotify() {
            this.memoizedIsInitialized = -1;
            this.data_ = Collections.emptyList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new FireworkSetNotify();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private FireworkSetNotify(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 8: {
                            this.code_ = input.readUInt32();
                            continue;
                        }
                        case 74: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.data_ = new ArrayList<FireworkSetDataOuterClass.FireworkSetData>();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.data_.add(input.readMessage(FireworkSetDataOuterClass.FireworkSetData.parser(), extensionRegistry));
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
                    this.data_ = Collections.unmodifiableList((List<? extends FireworkSetDataOuterClass.FireworkSetData>)this.data_);
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return FireworkSetNotifyOuterClass.internal_static_FireworkSetNotify_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return FireworkSetNotifyOuterClass.internal_static_FireworkSetNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(FireworkSetNotify.class, Builder.class);
        }
        
        @Override
        public int getCode() {
            return this.code_;
        }
        
        @Override
        public List<FireworkSetDataOuterClass.FireworkSetData> getDataList() {
            return this.data_;
        }
        
        @Override
        public List<? extends FireworkSetDataOuterClass.FireworkSetDataOrBuilder> getDataOrBuilderList() {
            return this.data_;
        }
        
        @Override
        public int getDataCount() {
            return this.data_.size();
        }
        
        @Override
        public FireworkSetDataOuterClass.FireworkSetData getData(final int index) {
            return this.data_.get(index);
        }
        
        @Override
        public FireworkSetDataOuterClass.FireworkSetDataOrBuilder getDataOrBuilder(final int index) {
            return this.data_.get(index);
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
            if (this.code_ != 0) {
                output.writeUInt32(1, this.code_);
            }
            for (int i = 0; i < this.data_.size(); ++i) {
                output.writeMessage(9, this.data_.get(i));
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
            if (this.code_ != 0) {
                size += CodedOutputStream.computeUInt32Size(1, this.code_);
            }
            for (int i = 0; i < this.data_.size(); ++i) {
                size += CodedOutputStream.computeMessageSize(9, this.data_.get(i));
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof FireworkSetNotify)) {
                return super.equals(obj);
            }
            final FireworkSetNotify other = (FireworkSetNotify)obj;
            return this.getCode() == other.getCode() && this.getDataList().equals(other.getDataList()) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 1;
            hash = 53 * hash + this.getCode();
            if (this.getDataCount() > 0) {
                hash = 37 * hash + 9;
                hash = 53 * hash + this.getDataList().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static FireworkSetNotify parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return FireworkSetNotify.PARSER.parseFrom(data);
        }
        
        public static FireworkSetNotify parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return FireworkSetNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static FireworkSetNotify parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return FireworkSetNotify.PARSER.parseFrom(data);
        }
        
        public static FireworkSetNotify parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return FireworkSetNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static FireworkSetNotify parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return FireworkSetNotify.PARSER.parseFrom(data);
        }
        
        public static FireworkSetNotify parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return FireworkSetNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static FireworkSetNotify parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(FireworkSetNotify.PARSER, input);
        }
        
        public static FireworkSetNotify parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(FireworkSetNotify.PARSER, input, extensionRegistry);
        }
        
        public static FireworkSetNotify parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(FireworkSetNotify.PARSER, input);
        }
        
        public static FireworkSetNotify parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(FireworkSetNotify.PARSER, input, extensionRegistry);
        }
        
        public static FireworkSetNotify parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(FireworkSetNotify.PARSER, input);
        }
        
        public static FireworkSetNotify parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(FireworkSetNotify.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return FireworkSetNotify.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final FireworkSetNotify prototype) {
            return FireworkSetNotify.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == FireworkSetNotify.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static FireworkSetNotify getDefaultInstance() {
            return FireworkSetNotify.DEFAULT_INSTANCE;
        }
        
        public static Parser<FireworkSetNotify> parser() {
            return FireworkSetNotify.PARSER;
        }
        
        @Override
        public Parser<FireworkSetNotify> getParserForType() {
            return FireworkSetNotify.PARSER;
        }
        
        @Override
        public FireworkSetNotify getDefaultInstanceForType() {
            return FireworkSetNotify.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new FireworkSetNotify();
            PARSER = new AbstractParser<FireworkSetNotify>() {
                @Override
                public FireworkSetNotify parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new FireworkSetNotify(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements FireworkSetNotifyOrBuilder
        {
            private int bitField0_;
            private int code_;
            private List<FireworkSetDataOuterClass.FireworkSetData> data_;
            private RepeatedFieldBuilderV3<FireworkSetDataOuterClass.FireworkSetData, FireworkSetDataOuterClass.FireworkSetData.Builder, FireworkSetDataOuterClass.FireworkSetDataOrBuilder> dataBuilder_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return FireworkSetNotifyOuterClass.internal_static_FireworkSetNotify_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return FireworkSetNotifyOuterClass.internal_static_FireworkSetNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(FireworkSetNotify.class, Builder.class);
            }
            
            private Builder() {
                this.data_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.data_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (FireworkSetNotify.alwaysUseFieldBuilders) {
                    this.getDataFieldBuilder();
                }
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.code_ = 0;
                if (this.dataBuilder_ == null) {
                    this.data_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                else {
                    this.dataBuilder_.clear();
                }
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return FireworkSetNotifyOuterClass.internal_static_FireworkSetNotify_descriptor;
            }
            
            @Override
            public FireworkSetNotify getDefaultInstanceForType() {
                return FireworkSetNotify.getDefaultInstance();
            }
            
            @Override
            public FireworkSetNotify build() {
                final FireworkSetNotify result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public FireworkSetNotify buildPartial() {
                final FireworkSetNotify result = new FireworkSetNotify(this);
                final int from_bitField0_ = this.bitField0_;
                result.code_ = this.code_;
                if (this.dataBuilder_ == null) {
                    if ((this.bitField0_ & 0x1) != 0x0) {
                        this.data_ = Collections.unmodifiableList((List<? extends FireworkSetDataOuterClass.FireworkSetData>)this.data_);
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    result.data_ = this.data_;
                }
                else {
                    result.data_ = this.dataBuilder_.build();
                }
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
                if (other instanceof FireworkSetNotify) {
                    return this.mergeFrom((FireworkSetNotify)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final FireworkSetNotify other) {
                if (other == FireworkSetNotify.getDefaultInstance()) {
                    return this;
                }
                if (other.getCode() != 0) {
                    this.setCode(other.getCode());
                }
                if (this.dataBuilder_ == null) {
                    if (!other.data_.isEmpty()) {
                        if (this.data_.isEmpty()) {
                            this.data_ = other.data_;
                            this.bitField0_ &= 0xFFFFFFFE;
                        }
                        else {
                            this.ensureDataIsMutable();
                            this.data_.addAll(other.data_);
                        }
                        this.onChanged();
                    }
                }
                else if (!other.data_.isEmpty()) {
                    if (this.dataBuilder_.isEmpty()) {
                        this.dataBuilder_.dispose();
                        this.dataBuilder_ = null;
                        this.data_ = other.data_;
                        this.bitField0_ &= 0xFFFFFFFE;
                        this.dataBuilder_ = (FireworkSetNotify.alwaysUseFieldBuilders ? this.getDataFieldBuilder() : null);
                    }
                    else {
                        this.dataBuilder_.addAllMessages(other.data_);
                    }
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
                FireworkSetNotify parsedMessage = null;
                try {
                    parsedMessage = FireworkSetNotify.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (FireworkSetNotify)e.getUnfinishedMessage();
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
            public int getCode() {
                return this.code_;
            }
            
            public Builder setCode(final int value) {
                this.code_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearCode() {
                this.code_ = 0;
                this.onChanged();
                return this;
            }
            
            private void ensureDataIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.data_ = new ArrayList<FireworkSetDataOuterClass.FireworkSetData>(this.data_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<FireworkSetDataOuterClass.FireworkSetData> getDataList() {
                if (this.dataBuilder_ == null) {
                    return Collections.unmodifiableList((List<? extends FireworkSetDataOuterClass.FireworkSetData>)this.data_);
                }
                return this.dataBuilder_.getMessageList();
            }
            
            @Override
            public int getDataCount() {
                if (this.dataBuilder_ == null) {
                    return this.data_.size();
                }
                return this.dataBuilder_.getCount();
            }
            
            @Override
            public FireworkSetDataOuterClass.FireworkSetData getData(final int index) {
                if (this.dataBuilder_ == null) {
                    return this.data_.get(index);
                }
                return this.dataBuilder_.getMessage(index);
            }
            
            public Builder setData(final int index, final FireworkSetDataOuterClass.FireworkSetData value) {
                if (this.dataBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureDataIsMutable();
                    this.data_.set(index, value);
                    this.onChanged();
                }
                else {
                    this.dataBuilder_.setMessage(index, value);
                }
                return this;
            }
            
            public Builder setData(final int index, final FireworkSetDataOuterClass.FireworkSetData.Builder builderForValue) {
                if (this.dataBuilder_ == null) {
                    this.ensureDataIsMutable();
                    this.data_.set(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.dataBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addData(final FireworkSetDataOuterClass.FireworkSetData value) {
                if (this.dataBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureDataIsMutable();
                    this.data_.add(value);
                    this.onChanged();
                }
                else {
                    this.dataBuilder_.addMessage(value);
                }
                return this;
            }
            
            public Builder addData(final int index, final FireworkSetDataOuterClass.FireworkSetData value) {
                if (this.dataBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureDataIsMutable();
                    this.data_.add(index, value);
                    this.onChanged();
                }
                else {
                    this.dataBuilder_.addMessage(index, value);
                }
                return this;
            }
            
            public Builder addData(final FireworkSetDataOuterClass.FireworkSetData.Builder builderForValue) {
                if (this.dataBuilder_ == null) {
                    this.ensureDataIsMutable();
                    this.data_.add(builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.dataBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder addData(final int index, final FireworkSetDataOuterClass.FireworkSetData.Builder builderForValue) {
                if (this.dataBuilder_ == null) {
                    this.ensureDataIsMutable();
                    this.data_.add(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.dataBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAllData(final Iterable<? extends FireworkSetDataOuterClass.FireworkSetData> values) {
                if (this.dataBuilder_ == null) {
                    this.ensureDataIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.data_);
                    this.onChanged();
                }
                else {
                    this.dataBuilder_.addAllMessages(values);
                }
                return this;
            }
            
            public Builder clearData() {
                if (this.dataBuilder_ == null) {
                    this.data_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                    this.onChanged();
                }
                else {
                    this.dataBuilder_.clear();
                }
                return this;
            }
            
            public Builder removeData(final int index) {
                if (this.dataBuilder_ == null) {
                    this.ensureDataIsMutable();
                    this.data_.remove(index);
                    this.onChanged();
                }
                else {
                    this.dataBuilder_.remove(index);
                }
                return this;
            }
            
            public FireworkSetDataOuterClass.FireworkSetData.Builder getDataBuilder(final int index) {
                return this.getDataFieldBuilder().getBuilder(index);
            }
            
            @Override
            public FireworkSetDataOuterClass.FireworkSetDataOrBuilder getDataOrBuilder(final int index) {
                if (this.dataBuilder_ == null) {
                    return this.data_.get(index);
                }
                return this.dataBuilder_.getMessageOrBuilder(index);
            }
            
            @Override
            public List<? extends FireworkSetDataOuterClass.FireworkSetDataOrBuilder> getDataOrBuilderList() {
                if (this.dataBuilder_ != null) {
                    return this.dataBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList((List<? extends FireworkSetDataOuterClass.FireworkSetDataOrBuilder>)this.data_);
            }
            
            public FireworkSetDataOuterClass.FireworkSetData.Builder addDataBuilder() {
                return this.getDataFieldBuilder().addBuilder(FireworkSetDataOuterClass.FireworkSetData.getDefaultInstance());
            }
            
            public FireworkSetDataOuterClass.FireworkSetData.Builder addDataBuilder(final int index) {
                return this.getDataFieldBuilder().addBuilder(index, FireworkSetDataOuterClass.FireworkSetData.getDefaultInstance());
            }
            
            public List<FireworkSetDataOuterClass.FireworkSetData.Builder> getDataBuilderList() {
                return this.getDataFieldBuilder().getBuilderList();
            }
            
            private RepeatedFieldBuilderV3<FireworkSetDataOuterClass.FireworkSetData, FireworkSetDataOuterClass.FireworkSetData.Builder, FireworkSetDataOuterClass.FireworkSetDataOrBuilder> getDataFieldBuilder() {
                if (this.dataBuilder_ == null) {
                    this.dataBuilder_ = new RepeatedFieldBuilderV3<FireworkSetDataOuterClass.FireworkSetData, FireworkSetDataOuterClass.FireworkSetData.Builder, FireworkSetDataOuterClass.FireworkSetDataOrBuilder>(this.data_, (this.bitField0_ & 0x1) != 0x0, this.getParentForChildren(), this.isClean());
                    this.data_ = null;
                }
                return this.dataBuilder_;
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
    
    public interface FireworkSetNotifyOrBuilder extends MessageOrBuilder
    {
        int getCode();
        
        List<FireworkSetDataOuterClass.FireworkSetData> getDataList();
        
        FireworkSetDataOuterClass.FireworkSetData getData(final int p0);
        
        int getDataCount();
        
        List<? extends FireworkSetDataOuterClass.FireworkSetDataOrBuilder> getDataOrBuilderList();
        
        FireworkSetDataOuterClass.FireworkSetDataOrBuilder getDataOrBuilder(final int p0);
    }
}
