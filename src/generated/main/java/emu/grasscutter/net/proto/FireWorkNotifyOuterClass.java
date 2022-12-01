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

public final class FireWorkNotifyOuterClass
{
    private static final Descriptors.Descriptor internal_static_FireWorkNotify_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_FireWorkNotify_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private FireWorkNotifyOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return FireWorkNotifyOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0014FireWorkNotify.proto\u001a\u0012FireWorkData.proto\"5\n\u000eFireWorkNotify\u0012#\n\ffireWorkData\u0018\u0001 \u0003(\u000b2\r.FireWorkDataB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        FireWorkNotifyOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { FireWorkDataOuterClass.getDescriptor() });
        internal_static_FireWorkNotify_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_FireWorkNotify_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(FireWorkNotifyOuterClass.internal_static_FireWorkNotify_descriptor, new String[] { "FireWorkData" });
        FireWorkDataOuterClass.getDescriptor();
    }
    
    public static final class FireWorkNotify extends GeneratedMessageV3 implements FireWorkNotifyOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int FIREWORKDATA_FIELD_NUMBER = 1;
        private List<FireWorkDataOuterClass.FireWorkData> fireWorkData_;
        private byte memoizedIsInitialized;
        private static final FireWorkNotify DEFAULT_INSTANCE;
        private static final Parser<FireWorkNotify> PARSER;
        
        private FireWorkNotify(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private FireWorkNotify() {
            this.memoizedIsInitialized = -1;
            this.fireWorkData_ = Collections.emptyList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new FireWorkNotify();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private FireWorkNotify(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.fireWorkData_ = new ArrayList<FireWorkDataOuterClass.FireWorkData>();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.fireWorkData_.add(input.readMessage(FireWorkDataOuterClass.FireWorkData.parser(), extensionRegistry));
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
                    this.fireWorkData_ = Collections.unmodifiableList((List<? extends FireWorkDataOuterClass.FireWorkData>)this.fireWorkData_);
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return FireWorkNotifyOuterClass.internal_static_FireWorkNotify_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return FireWorkNotifyOuterClass.internal_static_FireWorkNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(FireWorkNotify.class, Builder.class);
        }
        
        @Override
        public List<FireWorkDataOuterClass.FireWorkData> getFireWorkDataList() {
            return this.fireWorkData_;
        }
        
        @Override
        public List<? extends FireWorkDataOuterClass.FireWorkDataOrBuilder> getFireWorkDataOrBuilderList() {
            return this.fireWorkData_;
        }
        
        @Override
        public int getFireWorkDataCount() {
            return this.fireWorkData_.size();
        }
        
        @Override
        public FireWorkDataOuterClass.FireWorkData getFireWorkData(final int index) {
            return this.fireWorkData_.get(index);
        }
        
        @Override
        public FireWorkDataOuterClass.FireWorkDataOrBuilder getFireWorkDataOrBuilder(final int index) {
            return this.fireWorkData_.get(index);
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
            for (int i = 0; i < this.fireWorkData_.size(); ++i) {
                output.writeMessage(1, this.fireWorkData_.get(i));
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
            for (int i = 0; i < this.fireWorkData_.size(); ++i) {
                size += CodedOutputStream.computeMessageSize(1, this.fireWorkData_.get(i));
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof FireWorkNotify)) {
                return super.equals(obj);
            }
            final FireWorkNotify other = (FireWorkNotify)obj;
            return this.getFireWorkDataList().equals(other.getFireWorkDataList()) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.getFireWorkDataCount() > 0) {
                hash = 37 * hash + 1;
                hash = 53 * hash + this.getFireWorkDataList().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static FireWorkNotify parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return FireWorkNotify.PARSER.parseFrom(data);
        }
        
        public static FireWorkNotify parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return FireWorkNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static FireWorkNotify parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return FireWorkNotify.PARSER.parseFrom(data);
        }
        
        public static FireWorkNotify parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return FireWorkNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static FireWorkNotify parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return FireWorkNotify.PARSER.parseFrom(data);
        }
        
        public static FireWorkNotify parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return FireWorkNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static FireWorkNotify parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(FireWorkNotify.PARSER, input);
        }
        
        public static FireWorkNotify parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(FireWorkNotify.PARSER, input, extensionRegistry);
        }
        
        public static FireWorkNotify parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(FireWorkNotify.PARSER, input);
        }
        
        public static FireWorkNotify parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(FireWorkNotify.PARSER, input, extensionRegistry);
        }
        
        public static FireWorkNotify parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(FireWorkNotify.PARSER, input);
        }
        
        public static FireWorkNotify parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(FireWorkNotify.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return FireWorkNotify.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final FireWorkNotify prototype) {
            return FireWorkNotify.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == FireWorkNotify.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static FireWorkNotify getDefaultInstance() {
            return FireWorkNotify.DEFAULT_INSTANCE;
        }
        
        public static Parser<FireWorkNotify> parser() {
            return FireWorkNotify.PARSER;
        }
        
        @Override
        public Parser<FireWorkNotify> getParserForType() {
            return FireWorkNotify.PARSER;
        }
        
        @Override
        public FireWorkNotify getDefaultInstanceForType() {
            return FireWorkNotify.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new FireWorkNotify();
            PARSER = new AbstractParser<FireWorkNotify>() {
                @Override
                public FireWorkNotify parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new FireWorkNotify(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements FireWorkNotifyOrBuilder
        {
            private int bitField0_;
            private List<FireWorkDataOuterClass.FireWorkData> fireWorkData_;
            private RepeatedFieldBuilderV3<FireWorkDataOuterClass.FireWorkData, FireWorkDataOuterClass.FireWorkData.Builder, FireWorkDataOuterClass.FireWorkDataOrBuilder> fireWorkDataBuilder_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return FireWorkNotifyOuterClass.internal_static_FireWorkNotify_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return FireWorkNotifyOuterClass.internal_static_FireWorkNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(FireWorkNotify.class, Builder.class);
            }
            
            private Builder() {
                this.fireWorkData_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.fireWorkData_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (FireWorkNotify.alwaysUseFieldBuilders) {
                    this.getFireWorkDataFieldBuilder();
                }
            }
            
            @Override
            public Builder clear() {
                super.clear();
                if (this.fireWorkDataBuilder_ == null) {
                    this.fireWorkData_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                else {
                    this.fireWorkDataBuilder_.clear();
                }
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return FireWorkNotifyOuterClass.internal_static_FireWorkNotify_descriptor;
            }
            
            @Override
            public FireWorkNotify getDefaultInstanceForType() {
                return FireWorkNotify.getDefaultInstance();
            }
            
            @Override
            public FireWorkNotify build() {
                final FireWorkNotify result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public FireWorkNotify buildPartial() {
                final FireWorkNotify result = new FireWorkNotify(this);
                final int from_bitField0_ = this.bitField0_;
                if (this.fireWorkDataBuilder_ == null) {
                    if ((this.bitField0_ & 0x1) != 0x0) {
                        this.fireWorkData_ = Collections.unmodifiableList((List<? extends FireWorkDataOuterClass.FireWorkData>)this.fireWorkData_);
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    result.fireWorkData_ = this.fireWorkData_;
                }
                else {
                    result.fireWorkData_ = this.fireWorkDataBuilder_.build();
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
                if (other instanceof FireWorkNotify) {
                    return this.mergeFrom((FireWorkNotify)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final FireWorkNotify other) {
                if (other == FireWorkNotify.getDefaultInstance()) {
                    return this;
                }
                if (this.fireWorkDataBuilder_ == null) {
                    if (!other.fireWorkData_.isEmpty()) {
                        if (this.fireWorkData_.isEmpty()) {
                            this.fireWorkData_ = other.fireWorkData_;
                            this.bitField0_ &= 0xFFFFFFFE;
                        }
                        else {
                            this.ensureFireWorkDataIsMutable();
                            this.fireWorkData_.addAll(other.fireWorkData_);
                        }
                        this.onChanged();
                    }
                }
                else if (!other.fireWorkData_.isEmpty()) {
                    if (this.fireWorkDataBuilder_.isEmpty()) {
                        this.fireWorkDataBuilder_.dispose();
                        this.fireWorkDataBuilder_ = null;
                        this.fireWorkData_ = other.fireWorkData_;
                        this.bitField0_ &= 0xFFFFFFFE;
                        this.fireWorkDataBuilder_ = (FireWorkNotify.alwaysUseFieldBuilders ? this.getFireWorkDataFieldBuilder() : null);
                    }
                    else {
                        this.fireWorkDataBuilder_.addAllMessages(other.fireWorkData_);
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
                FireWorkNotify parsedMessage = null;
                try {
                    parsedMessage = FireWorkNotify.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (FireWorkNotify)e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                }
                finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            
            private void ensureFireWorkDataIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.fireWorkData_ = new ArrayList<FireWorkDataOuterClass.FireWorkData>(this.fireWorkData_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<FireWorkDataOuterClass.FireWorkData> getFireWorkDataList() {
                if (this.fireWorkDataBuilder_ == null) {
                    return Collections.unmodifiableList((List<? extends FireWorkDataOuterClass.FireWorkData>)this.fireWorkData_);
                }
                return this.fireWorkDataBuilder_.getMessageList();
            }
            
            @Override
            public int getFireWorkDataCount() {
                if (this.fireWorkDataBuilder_ == null) {
                    return this.fireWorkData_.size();
                }
                return this.fireWorkDataBuilder_.getCount();
            }
            
            @Override
            public FireWorkDataOuterClass.FireWorkData getFireWorkData(final int index) {
                if (this.fireWorkDataBuilder_ == null) {
                    return this.fireWorkData_.get(index);
                }
                return this.fireWorkDataBuilder_.getMessage(index);
            }
            
            public Builder setFireWorkData(final int index, final FireWorkDataOuterClass.FireWorkData value) {
                if (this.fireWorkDataBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureFireWorkDataIsMutable();
                    this.fireWorkData_.set(index, value);
                    this.onChanged();
                }
                else {
                    this.fireWorkDataBuilder_.setMessage(index, value);
                }
                return this;
            }
            
            public Builder setFireWorkData(final int index, final FireWorkDataOuterClass.FireWorkData.Builder builderForValue) {
                if (this.fireWorkDataBuilder_ == null) {
                    this.ensureFireWorkDataIsMutable();
                    this.fireWorkData_.set(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.fireWorkDataBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addFireWorkData(final FireWorkDataOuterClass.FireWorkData value) {
                if (this.fireWorkDataBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureFireWorkDataIsMutable();
                    this.fireWorkData_.add(value);
                    this.onChanged();
                }
                else {
                    this.fireWorkDataBuilder_.addMessage(value);
                }
                return this;
            }
            
            public Builder addFireWorkData(final int index, final FireWorkDataOuterClass.FireWorkData value) {
                if (this.fireWorkDataBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureFireWorkDataIsMutable();
                    this.fireWorkData_.add(index, value);
                    this.onChanged();
                }
                else {
                    this.fireWorkDataBuilder_.addMessage(index, value);
                }
                return this;
            }
            
            public Builder addFireWorkData(final FireWorkDataOuterClass.FireWorkData.Builder builderForValue) {
                if (this.fireWorkDataBuilder_ == null) {
                    this.ensureFireWorkDataIsMutable();
                    this.fireWorkData_.add(builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.fireWorkDataBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder addFireWorkData(final int index, final FireWorkDataOuterClass.FireWorkData.Builder builderForValue) {
                if (this.fireWorkDataBuilder_ == null) {
                    this.ensureFireWorkDataIsMutable();
                    this.fireWorkData_.add(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.fireWorkDataBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAllFireWorkData(final Iterable<? extends FireWorkDataOuterClass.FireWorkData> values) {
                if (this.fireWorkDataBuilder_ == null) {
                    this.ensureFireWorkDataIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.fireWorkData_);
                    this.onChanged();
                }
                else {
                    this.fireWorkDataBuilder_.addAllMessages(values);
                }
                return this;
            }
            
            public Builder clearFireWorkData() {
                if (this.fireWorkDataBuilder_ == null) {
                    this.fireWorkData_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                    this.onChanged();
                }
                else {
                    this.fireWorkDataBuilder_.clear();
                }
                return this;
            }
            
            public Builder removeFireWorkData(final int index) {
                if (this.fireWorkDataBuilder_ == null) {
                    this.ensureFireWorkDataIsMutable();
                    this.fireWorkData_.remove(index);
                    this.onChanged();
                }
                else {
                    this.fireWorkDataBuilder_.remove(index);
                }
                return this;
            }
            
            public FireWorkDataOuterClass.FireWorkData.Builder getFireWorkDataBuilder(final int index) {
                return this.getFireWorkDataFieldBuilder().getBuilder(index);
            }
            
            @Override
            public FireWorkDataOuterClass.FireWorkDataOrBuilder getFireWorkDataOrBuilder(final int index) {
                if (this.fireWorkDataBuilder_ == null) {
                    return this.fireWorkData_.get(index);
                }
                return this.fireWorkDataBuilder_.getMessageOrBuilder(index);
            }
            
            @Override
            public List<? extends FireWorkDataOuterClass.FireWorkDataOrBuilder> getFireWorkDataOrBuilderList() {
                if (this.fireWorkDataBuilder_ != null) {
                    return this.fireWorkDataBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList((List<? extends FireWorkDataOuterClass.FireWorkDataOrBuilder>)this.fireWorkData_);
            }
            
            public FireWorkDataOuterClass.FireWorkData.Builder addFireWorkDataBuilder() {
                return this.getFireWorkDataFieldBuilder().addBuilder(FireWorkDataOuterClass.FireWorkData.getDefaultInstance());
            }
            
            public FireWorkDataOuterClass.FireWorkData.Builder addFireWorkDataBuilder(final int index) {
                return this.getFireWorkDataFieldBuilder().addBuilder(index, FireWorkDataOuterClass.FireWorkData.getDefaultInstance());
            }
            
            public List<FireWorkDataOuterClass.FireWorkData.Builder> getFireWorkDataBuilderList() {
                return this.getFireWorkDataFieldBuilder().getBuilderList();
            }
            
            private RepeatedFieldBuilderV3<FireWorkDataOuterClass.FireWorkData, FireWorkDataOuterClass.FireWorkData.Builder, FireWorkDataOuterClass.FireWorkDataOrBuilder> getFireWorkDataFieldBuilder() {
                if (this.fireWorkDataBuilder_ == null) {
                    this.fireWorkDataBuilder_ = new RepeatedFieldBuilderV3<FireWorkDataOuterClass.FireWorkData, FireWorkDataOuterClass.FireWorkData.Builder, FireWorkDataOuterClass.FireWorkDataOrBuilder>(this.fireWorkData_, (this.bitField0_ & 0x1) != 0x0, this.getParentForChildren(), this.isClean());
                    this.fireWorkData_ = null;
                }
                return this.fireWorkDataBuilder_;
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
    
    public interface FireWorkNotifyOrBuilder extends MessageOrBuilder
    {
        List<FireWorkDataOuterClass.FireWorkData> getFireWorkDataList();
        
        FireWorkDataOuterClass.FireWorkData getFireWorkData(final int p0);
        
        int getFireWorkDataCount();
        
        List<? extends FireWorkDataOuterClass.FireWorkDataOrBuilder> getFireWorkDataOrBuilderList();
        
        FireWorkDataOuterClass.FireWorkDataOrBuilder getFireWorkDataOrBuilder(final int p0);
    }
}
